class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        int len1 = my_string.length();
        int len2 = target.length();
        
        for (int i=0; i<len1-len2+1; i++) {
            if (my_string.charAt(i) == target.charAt(0)) {
                if (my_string.substring(i, i+len2).equals(target)) {
                    return 1;
                }
            }
        }
        
        return answer;
    }
}