class Solution {
    
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, n, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int i, int n, int[][] computers) {
        for (int j=0; j<n; j++) {
            if (computers[i][j]==1 && !visited[j]) {
                visited[j] = true;
                dfs(j, n, computers);
            }
        }
    }
    
}