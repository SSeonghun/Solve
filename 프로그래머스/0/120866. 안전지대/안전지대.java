class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        int[] dix = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] diy = {-1, 0, 1, 1, 1, 0, -1, -1};
        int dx=0;
        int dy=0;
        
        int cnt = 0;
        
        for (int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                if (board[i][j]==1) {
                    cnt++;
                    for (int k=0; k<8; k++) {
                        dx = i + dix[k];
                        dy = j + diy[k];
                        if (dx>=0 && dx<len && dy>=0 && dy<len) {
                            if (board[dx][dy]==0) {
                                cnt++;
                                board[dx][dy]=2;
                            }
                        }
                    }
                    
                }
            }
        }
        answer = len*len-cnt;
        
        return answer;
    }
}