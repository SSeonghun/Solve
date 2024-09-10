import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Queue<Integer> q = new PriorityQueue<>();
        
        for (int i: emergency) {
            q.add(i);
        }
        
        int count = emergency.length;
        
        for (int i=0; i<emergency.length; i++) {
            int num = q.poll();
            for (int j=0; j<emergency.length; j++) {
                if (emergency[j]==num) {
                    answer[j] = count--;
                }
            }
        }
        
        return answer;
    }
}