class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length()!=4 && s.length()!=6) {
            answer = false;
            
            return answer;
        }
        
        for (char c : s.toCharArray()) {
            if (c-'0'>9) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}