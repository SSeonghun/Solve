import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Set<Integer> set = new HashSet<>();
        boolean[] visited = new boolean[lost.length];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i : reserve) {
            set.add(i);
        }
        
        for (int i=0; i<lost.length; i++) {
            if (set.contains(lost[i])) {
                answer++;
                visited[i] = true;
                set.remove(lost[i]);
            }
        }
        
        for (int i=0; i<lost.length; i++) {
            if (visited[i]) {
                continue;
            }
            
            if (set.contains(lost[i]-1)) {
                answer++;
                set.remove(lost[i]-1);
                visited[i] = true;
            } else if (set.contains(lost[i]+1)) {
                answer++;
                set.remove(lost[i]+1);
                visited[i] = true;
            }
        }
        
        return answer;
    }
}