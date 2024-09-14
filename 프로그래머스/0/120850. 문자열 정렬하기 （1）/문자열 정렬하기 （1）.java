import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> arr = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (c-'0'>=0 && c-'0'<=9) {
                arr.add(c-'0');
            }
        }
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}