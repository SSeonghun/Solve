import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        
        for (int i : arr) {
            if (answer.isEmpty() || answer.peek() != i) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}