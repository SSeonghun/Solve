import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        boolean flag;
        
        for (int i : arr) {
            flag = false;
            for (int j : delete_list) {
                if(i==j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer.add(i);
            }
        } 
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}