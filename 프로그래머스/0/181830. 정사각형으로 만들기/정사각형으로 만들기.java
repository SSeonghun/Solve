class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        int rowLen = arr.length;
        int colLen = arr[0].length;
        
        if (rowLen >= colLen) {
            answer = new int[rowLen][rowLen];
        } else {
            answer = new int[colLen][colLen];
        }
        
        for (int i=0; i<rowLen; i++) {
                for (int j=0; j<colLen; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        
        return answer;
    }
}