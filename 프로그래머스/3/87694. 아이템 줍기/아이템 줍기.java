import java.util.*;

class Solution {
    
    static int[][] map = new int[102][102];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        
        for (int[] rect : rectangle) {
            int x1 = rect[0]*2;
            int y1 = rect[1]*2;
            int x2 = rect[2]*2;
            int y2 = rect[3]*2;
            
            for (int i=x1; i<=x2; i++) {
                for (int j=y1; j<=y2; j++) {
                    map[i][j] = 1;
                }
            }
        }
        
        for (int[] rect : rectangle) {
            int x1 = rect[0]*2;
            int y1 = rect[1]*2;
            int x2 = rect[2]*2;
            int y2 = rect[3]*2;
            
            for (int i=x1+1; i<x2; i++) {
                for (int j=y1+1; j<y2; j++) {
                    map[i][j] = 2;
                }
            }
        }

        return bfs(characterX*2, characterY*2, itemX*2, itemY*2);
    }
    
    public static int bfs(int startX, int startY, int itemX, int itemY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX ,startY, 0});
        boolean[][] visited = new boolean[102][102];
        visited[startX][startY] = true;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];
            
            if (x == itemX && y == itemY) {
                return dist/2;
            }
            
            for (int i=0; i<4; i++) {
                int dix = x + dx[i];
                int diy = y + dy[i];
                
                if (dix>=0 && dix<102 && diy>=0 && diy<102 && map[dix][diy]==1 && !visited[dix][diy]) {
                    visited[dix][diy] = true;
                    queue.add(new int[]{dix, diy, dist+1});
                }
            }
        }
        return -1;
    }
}