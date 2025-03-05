class Solution {
    
    static int answer;
    
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, visited, 0);
        
        return answer;
    }
    
    public void dfs(int k, int[][] dungeons, boolean[] visited, int depth) {
        
        if (answer<=depth) {
            answer = depth;
        }
        
        for (int i=0; i<dungeons.length; i++) {
            
            if (visited[i] || k<dungeons[i][0]) {
                continue;
            }
            
            visited[i] = true;
            dfs(k-dungeons[i][1], dungeons, visited, depth+1);
            visited[i] = false;
        }
    }
}