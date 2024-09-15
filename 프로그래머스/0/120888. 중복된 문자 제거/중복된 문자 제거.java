import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();;
        Set<Character> arr = new LinkedHashSet<>();
        
        for (int i=0; i<my_string.length(); i++) {
            arr.add(my_string.charAt(i));
        }
        
        for (char c : arr) {
            answer.append(c);
        }
    
        return answer.toString();
    }
}