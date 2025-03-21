class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i=0; i<parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            String str = my_strings[i];
            
            for (int j=s; j<=e; j++) {
                answer += str.charAt(j);
            }
        }
        return answer;
    }
}