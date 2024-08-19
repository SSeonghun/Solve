import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i=l; i<=r; i++) {
            String str = Integer.toString(i);
            boolean flag = true;
            
            for (char c: str.toCharArray()) {
                if (c != '5' && c != '0') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
                answer.add(-1);
            }
        
        int[] result = answer.stream().mapToInt(i -> i).toArray();
        
        return result;
    }
}