import java.util.*;

class Solution {
    
    static int answer = 0;
    static int[] bucket;
    static boolean[] visited;
    static List<List<Integer>> list = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();
    
    public int solution(int n, int[][] edge) {
        
        bucket = new int[n+1];
        visited = new boolean[n+1];
        
        for (int i=0; i<=n; i++) {
            list.add(new ArrayList<>());
        }
        
        for (int[] arr : edge) {
            list.get(arr[0]).add(arr[1]);
            list.get(arr[1]).add(arr[0]);
        }
        
        List<Integer> arr = list.get(1);
        visited[1] = true;
        bucket[1] = 0;
        
        for (int i : arr) {
            visited[i] = true;
            q.add(i);
        }
        
       bfs();
        
        int max = 0;
        
        for (int i : bucket) {
            
            if (i>max) {
                max = i;
                answer = 1;
            } else if (i==max) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void bfs() {
        
        while (!q.isEmpty()) {
            
            int cnt = q.poll();
            
            for (int i : list.get(cnt)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    bucket[i] = bucket[cnt]+1;
                }
                
            }
        }

        
    }
}