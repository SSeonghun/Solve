import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int st = -1;
        int ed = 0;
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==2) {
                st = i;
                break;
            }
        }
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==2) {
                ed = i;
            }
        }
        
        if (st==-1) {
            answer.add(-1);
        } else if (st==ed) {
            answer.add(2);
        } else {
            for (int i=st; i<=ed; i++) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}