import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int maxCount = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            
            if (maxCount < count) {
                maxCount = count;
                answer = key;
            } else if (maxCount == count){
                answer = -1;
            }
        }
        
        return answer;
    }
}