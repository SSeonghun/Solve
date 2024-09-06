import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length/2;
        
        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        answer = Math.min(map.size(),n);
        
        return answer;
    }
}