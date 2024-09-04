class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int v = 1;
        
        int colS=0;
        int rowS=0;
        int colE=n-1;
        int rowE=n-1;
        
        while (v<=n*n) {
            
            for (int i=colS; i<=colE; i++) {
                answer[rowS][i] = v;
                v++;
            }
            rowS++;
            
            for (int i=rowS; i<=rowE; i++) {
                answer[i][colE] = v;
                v++;
            }
            colE--;
            
            for (int i=colE; i>=colS; i--) {
                answer[rowE][i] = v;
                v++;
            }
            rowE--;

            for (int i=rowE; i>=rowS; i--) {
                answer[i][colS] = v;
                v++;
            }
            colS++;
            
        }
        
        
        return answer;
    }
}