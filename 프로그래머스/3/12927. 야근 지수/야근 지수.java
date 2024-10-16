import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i=0; i<works.length; i++) {
            q.add(works[i]);
        }
        for (int i=0; i<n; i++) {
            int num = q.poll();
            
            if (num==0) {
                q.add(num);
                continue;
            }
            num--;
            q.add(num);
        }
        
        int size = q.size();
        
        for (int i=0; i<size; i++){
            int num = q.poll();
            System.out.print(num);
            answer += num*num;
        }
            
        return answer;
    }
}