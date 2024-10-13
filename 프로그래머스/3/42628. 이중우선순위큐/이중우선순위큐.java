import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> minQ = new PriorityQueue<>();
        Queue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String st : operations) {
            if (st.charAt(0) == 'I') {
                minQ.add(Integer.parseInt(st.substring(2)));
                maxQ.add(Integer.parseInt(st.substring(2)));
            } else {
                if (st.substring(2).equals("-1")) {
                    maxQ.remove(minQ.poll());
                } else {
                    minQ.remove(maxQ.poll());
                }
            }
        }
        
        if (minQ.isEmpty()) {
            answer[1] = 0;
            answer[0] = 0;
        } else {
            answer[1] = minQ.poll();
            answer[0] = maxQ.poll();    
        }
        
    
        return answer;
    }
}