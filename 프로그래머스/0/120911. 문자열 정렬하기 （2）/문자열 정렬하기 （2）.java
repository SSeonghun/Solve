import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        my_string = my_string.toLowerCase();
        
        for (int i=0; i<my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
        }
        
        Arrays.sort(arr);
        
        answer = new String(arr);
        
        return answer;
    }
}