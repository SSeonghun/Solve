import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        // answer.add(arr[0]);
        
        int i =0;
        
        while (i<arr.length) {
            int idx = answer.size()-1;
            if (answer.isEmpty()) {
                answer.add(arr[i]);
                i++;
            } else if (answer.get(idx)==arr[i]) {
                answer.remove(idx);
                i++;
            } else {
                answer.add(arr[i]);
                i++;
            }
        }
        
        if (answer.isEmpty()) {
            return new int[]{-1};
        }
        
        return answer.stream().mapToInt(value->value).toArray();
    }
}