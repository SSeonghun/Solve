import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();
        
        int num=2;
        
        while (n>1) {
            if (n % num ==0) {
                answer.add(num);
                n = n/num;
            } else {
                num++;
            }
        }
        
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}