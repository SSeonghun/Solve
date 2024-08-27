import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
        
        String[] arr = myString.split("x");
        
        for (String st : arr) {
            if (!st.isEmpty()) {
                answer.add(st);
            }
        }
        String[] result = answer.toArray(new String[0]);
        Arrays.sort(result);
        
        return result;
    }
}