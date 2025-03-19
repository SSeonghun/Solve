import java.util.*;

class Solution {
    
    static int[] parent;
    
    public int solution(int n, int[][] costs) {
        
        Arrays.sort(costs, (a,b) -> a[2]-b[2]);
        
        parent = new int[n];
        for (int i=0; i<n; i++) {
            parent[i] = i;
        }
        
        int totalCost = 0;
        for (int[] edge : costs) {
            int a = edge[0];
            int b = edge[1];
            int cost = edge[2];
            
            if (find(a) != find(b)) {
                union(a,b);
                totalCost+=cost;
            }
        }
        
        return totalCost;
    }
    
    public static int find(int x) {
        if (parent[x]==x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
        
    public static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA!=rootB) {
            parent[rootB] = rootA;
        }
    }
}