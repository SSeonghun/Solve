import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        
        HashSet<Integer> indexSet = new HashSet<>();
        
        for (int i : indices) {
            indexSet.add(i);
        }
        
        for (int i=0; i<my_string.length(); i++) {
            if (!indexSet.contains(i)) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}