import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
    
        for (int n : arr) {
            set.add(n);
            if (set.size()==k) {
                break;
            }
        }
        
        int idx = 0;
        
        for (int value : set) {
            answer[idx] = value;
            idx++;
        }
        
        return answer;
    }
}