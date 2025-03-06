import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int len = genres.length;
        Map<String, Integer> totalPlay = new HashMap<>();
        Map<String, PriorityQueue<int[]>> genrePlay = new HashMap<>();
        
        for (int i=0; i<len; i++) {
            totalPlay.put(genres[i], totalPlay.getOrDefault(genres[i], 0)+plays[i]);
            genrePlay.putIfAbsent(genres[i], new PriorityQueue<>((a,b) -> b[1]-a[1]));
            genrePlay.get(genres[i]).offer(new int[]{i, plays[i]});
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(totalPlay.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        List<Integer> answer = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : sortedList) {
            PriorityQueue<int[]> queue = genrePlay.get(entry.getKey());
            answer.add(queue.poll()[0]);
            if (!queue.isEmpty()) {
                answer.add(queue.poll()[0]);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}