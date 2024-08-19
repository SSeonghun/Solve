import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr.length;
        int i = 1;
        
        list.add(arr[0]);
        
        while (i < len) { 
            if (list.size() == 0) { 
                list.add(arr[i]); 
                i++; 
            } else {
                int last = list.get(list.size() - 1);
                if (last < arr[i]) {
                    list.add(arr[i]);
                    i++; 
                }  else {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] stk = list.stream().mapToInt(j->j).toArray();
        
        return stk;
    }
}