import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>((a,b) -> rank[a]-rank[b]);
        
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                q.add(i);
            }
        }
        
        answer = 10000*q.poll() + 100*q.poll() + q.poll();
        
        return answer;
    }
}