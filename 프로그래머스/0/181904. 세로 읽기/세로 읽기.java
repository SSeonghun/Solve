class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int len = my_string.length();
        int n = 0;
        
        char[][] arr = new char[len/m][m];
        
        for (int i=0; i<len/m; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = my_string.charAt(n);
                n++;
            }
        }
        
        for (int i=0; i<len/m; i++) {
            answer += arr[i][c-1];
        }
        
        return answer;
    }
}