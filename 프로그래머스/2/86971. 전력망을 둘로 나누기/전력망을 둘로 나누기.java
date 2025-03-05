import java.util.*;

class Solution {
    
    static boolean visited[];
    static List<List<Integer>> graph;
    
    public int solution(int n, int[][] wires) {
        
        int answer = 100;
        
        graph = new ArrayList<>();
        for (int i=0; i<n+1; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        for (int[] wire : wires) {
            
            graph.get(wire[0]).remove(Integer.valueOf(wire[1]));
            graph.get(wire[1]).remove(Integer.valueOf(wire[0]));
            
            visited = new boolean[n+1];
            int count = dfs(1);
            
            int diff = Math.abs((n-count)-count);
            answer = Math.min(answer,diff);
            
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        return answer;
        
    }
    
    public int dfs(int node) {
        
        visited[node] = true;
        int count = 1;
        
        for (int i : graph.get(node)) {
            if (!visited[i]) {
                count += dfs(i);
            }
        }
        
        return count;
    }
}