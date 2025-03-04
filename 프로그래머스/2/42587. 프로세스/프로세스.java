import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> q = new ArrayDeque<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i=0; i<priorities.length; i++) {
            q.offer(new int[]{i, priorities[i]});
            pq.add(priorities[i]);
        }
        
        while (true) {
            int[] p = q.poll();
            
            if (p[1] == pq.peek()) {
                pq.poll();
                answer++;
                if (p[0] == location) {
                    return answer;
                }
            } else {
                q.offer(new int[]{p[0], p[1]});
            }
        }
        
    }
}