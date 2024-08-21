class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        int len = code.length();
        
        for (int i=r; i<len; i=i+q) {
            answer += code.charAt(i);
        }
        
        return answer;
    }
}