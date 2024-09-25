import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int minusCount = 0;
        int plusCount = 0;
        
        if (numbers.length==2) {
            return numbers[0]*numbers[1];
        }
        
        Arrays.sort(numbers);
        
        for (int i : numbers) {
            if (i<0) {
                minusCount++;
            } else if (i>=0) {
                plusCount++;
            }
        }
        
        int[] minus = new int[minusCount];
        int[] plus = new int[plusCount];
        
        int midx = 0;
        int pidx = 0;
        
        for (int i : numbers) {
            if (i<0) {
                minus[midx] = i;
                midx++;
            } else if (i>=0) {
                plus[pidx] = i;
                pidx++;
            }
        }
        
        int minusMax = 0;
        int plusMax = 0;
        
        if (minus.length >= 2) {
            minusMax = minus[0]*minus[1];
        }
        
        if (plus.length >= 2) {
            plusMax = plus[plus.length-1]*plus[plus.length-2];
        }
        
        
        answer = (minusMax>plusMax) ? minusMax : plusMax;
        
        
        
        return answer;
    }
}