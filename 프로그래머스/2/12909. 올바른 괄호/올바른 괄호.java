class Solution {
    boolean solution(String s) {

        int open = 0;
        int close = 0;
        
        if (s.charAt(0)=='(' && s.charAt(s.length()-1)==')') {
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i)=='(') {
                    open++;
                } else {
                    close++;
                }
                if (open<close) {
                    return false;
                }
            }
        } else {
            return false;
        }

        if (open == close) {
            return true;
        } else {
            return false;
        }
    }
}