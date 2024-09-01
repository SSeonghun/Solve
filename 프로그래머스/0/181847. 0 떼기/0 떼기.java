class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean flag = false;
        
        for (int i=0; i<n_str.length(); i++) {
            if (n_str.charAt(i) == '0') {
                if (flag) {
                    answer += n_str.charAt(i);
                }
                continue;
                
            } else {
                answer += n_str.charAt(i);
                flag = true;
            }
        }
        
        return answer;
    }
}