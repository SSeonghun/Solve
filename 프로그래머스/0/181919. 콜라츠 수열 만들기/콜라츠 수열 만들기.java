import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> List = new ArrayList<>();
        
        List.add(n);
        
        while (n!=1) {
            if (n%2==0) {
                n = n/2;
            } else {
                n = n*3 + 1;
            }
            List.add(n);
        }
        
        int[] answer = List.stream().mapToInt(i->i).toArray();
    
        return answer;
    }
}