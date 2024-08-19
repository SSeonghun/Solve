import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i=start_num; i<=end_num; i++) {
            arr.add(i);
        }
        
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}