import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int garo = 0;
        int sero = 0;
        
        
        if (dots[0][0]!=dots[1][0]) {
            garo = Math.abs(dots[0][0]-dots[1][0]);
        } else if (dots[0][0]!=dots[2][0]) {
            garo = Math.abs(dots[0][0]-dots[2][0]);
        }
        
        if (dots[0][1]!=dots[1][1]) {
            sero = Math.abs(dots[0][1]-dots[1][1]);
        } else if (dots[0][1]!=dots[2][1]) {
            sero = Math.abs(dots[0][1]-dots[2][1]);
        }
        
        answer = garo * sero;
        
        return answer;
    }
}