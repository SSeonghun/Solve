import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();
        
        for (int i : scoville) {
            q.add(i);
        }
        
        while (q.size() > 1) {
            int v = q.peek();
            
            if (v<K) {
                int a = q.poll();
                int b = q.poll();
                int mix = a + b*2;
                
                q.add(mix);
                answer++;
                
            } else {
                break;
            }
            
        }
        
        if (q.peek()<K) {
            answer = -1;
        }
        
        return answer;
    }
}