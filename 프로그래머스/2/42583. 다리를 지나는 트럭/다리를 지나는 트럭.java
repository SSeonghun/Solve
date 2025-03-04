import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> truck_q = new ArrayDeque<>();
        Queue<int[]> bridge_q = new ArrayDeque<>();
        
        for (int i : truck_weights) {
            truck_q.add(i);
        }
        
        int w = 0;
                        
        while(!truck_q.isEmpty() || !bridge_q.isEmpty()) {
            answer++;
            
            if (!bridge_q.isEmpty() && bridge_q.peek()[0] == answer) {
                w -= bridge_q.poll()[1];
            }
            
            if (!truck_q.isEmpty() && w+truck_q.peek()<=weight) {
                int truck = truck_q.poll();
                w+=truck;
                bridge_q.add(new int[]{answer+bridge_length, truck});
            }
        }
        
        return answer;
    }
}