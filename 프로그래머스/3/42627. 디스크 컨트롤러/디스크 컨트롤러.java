import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int currentTime = 0;
        int idx = 0;
        int n = jobs.length;
        
        // 작업을 도착 시간 순으로 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // 최소 힙을 사용하여 대기 중인 작업을 처리
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        while (idx < n || !pq.isEmpty()) {
            // 현재 시간에 도착한 작업들을 모두 큐에 추가
            while (idx < n && jobs[idx][0] <= currentTime) {
                pq.offer(jobs[idx]);
                idx++;
            }

            // 큐가 비지 않으면 처리할 작업을 꺼내서 처리
            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                currentTime += job[1];  // 작업 처리 시간 추가
                answer += currentTime - job[0];  // 작업 대기 시간 추가
            } else {
                // 큐가 비면 시간을 다음 작업이 도착하는 시간으로 이동
                currentTime = jobs[idx][0];
            }
        }
        
        return answer / n;  // 평균 대기 시간
    }
}
