import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i=0; i<2; i++) {
            int st = intervals[i][0];
            int ed = intervals[i][1];
            for (int j=st; j<=ed; j++) {
                answer.add(arr[j]);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}