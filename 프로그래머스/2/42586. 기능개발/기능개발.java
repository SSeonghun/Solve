import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        
        // 각 작업의 완료까지 필요한 일수를 계산하여 큐에 추가
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.offer(days);
        }
        
        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            int num = q.poll();
            int count = 1;
            
            // 배포 가능한 작업들을 한 번에 배포
            while (!q.isEmpty() && q.peek() <= num) {
                q.poll();
                count++;
            }
            answer.add(count);
        } 
        
        // List를 배열로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
