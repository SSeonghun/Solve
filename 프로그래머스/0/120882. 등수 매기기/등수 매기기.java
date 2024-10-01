import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[][] arr = new double[score.length][2];
        
        for (int i=0; i<score.length; i++) {
            arr[i][0] = i;
            arr[i][1] = (double) (score[i][0]+score[i][1]) / 2;
        }
        
        Arrays.sort(arr, (a,b) -> Double.compare(b[1], a[1]));
        
        int res = 2;
        
        answer[(int)arr[0][0]] = 1;
        
        for (int i=1; i<score.length; i++) {
            if (arr[i][1]== arr[i-1][1]) {
                answer[(int)arr[i][0]] = answer[(int)arr[i-1][0]];
            }
            else {
                answer[(int)arr[i][0]] = res;
            }
            res++;
        }
        
        return answer;
    }
}