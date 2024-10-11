import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] bucket = new int[triangle.length][triangle[triangle.length-1].length];
        bucket[0][0] = triangle[0][0];
        
        for (int i=1; i<triangle.length; i++) {
            for (int j=0; j<triangle[i].length; j++) {
                
                if (j-1<0) {
                    bucket[i][j] = triangle[i][j] + bucket[i-1][j];
                } else if (j>=triangle[i-1].length) {
                    bucket[i][j] = triangle[i][j] + bucket[i-1][j-1];
                } else {
                    bucket[i][j] = triangle[i][j] + Math.max(bucket[i-1][j], bucket[i-1][j-1]);
                }
                
            }
        }
        
        
        for (int i : bucket[bucket.length-1]) {
            if (i > answer) {
                answer = i;
            }
        }
        
        
        return answer;
    }
}