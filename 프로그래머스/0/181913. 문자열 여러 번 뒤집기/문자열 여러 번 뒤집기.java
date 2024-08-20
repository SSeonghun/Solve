class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        
        for (int i=0; i<queries.length; i++) {
            int st = queries[i][0];
            int ed = queries[i][1];
            
            for (int j=st; j<=(st+ed)/2; j++) {
                char temp = answer[j];
                answer[j] = answer[st+ed-j];
                answer[st+ed-j] = temp;
            }
            
        }
        
        return new String(answer);
    }
}