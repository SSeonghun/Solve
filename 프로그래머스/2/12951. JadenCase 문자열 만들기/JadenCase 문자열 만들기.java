import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        s = s.toLowerCase();
        
        char c = s.charAt(0);
        
        if (c-'0'<10) {
        }else {
            c = Character.toUpperCase(c);
        }
        sb.append(c);
        
        boolean flag = false;
        
        for (int i=1; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch==' ') {
                flag = true;
            } else if (flag) {
                ch = Character.toUpperCase(ch);
                flag = false;
            }
            sb.append(ch);
            
        }
        
        
        return sb.toString();
    }
}