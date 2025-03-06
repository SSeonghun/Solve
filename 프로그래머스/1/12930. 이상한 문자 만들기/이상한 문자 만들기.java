class Solution {
    public String solution(String s) {
        String answer = "";
        
        int cnt = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.substring(i,i+1).equals(" ")) {
                answer+=" ";
                cnt=0;
            } else if (cnt%2==0) {
                answer += s.substring(i,i+1).toUpperCase();
                cnt++;
            } else {
                answer += s.substring(i,i+1).toLowerCase();
                cnt++;
            }
            
        }
        
        return answer;
    }
}