import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i=0; i<progresses.length; i++) {
            int days = (int) Math.ceil((100.0-progresses[i])/speeds[i]);
            q.offer(days);
        }
        
        while (!q.isEmpty()) {
            int num = q.poll();
            int count = 1;

            while(!q.isEmpty() && q.peek()<=num) {
                q.poll();
                count++;
            }
            answer.add(count);
        } 
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}