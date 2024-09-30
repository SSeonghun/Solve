import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {       
        int len = numlist.length;
        int[] answer = new int[len];
        int[] arr = new int[len];
        
        Arrays.sort(numlist);
        int a = 0;
        
        // for (int i=0; i<len; i++) {
        //     if (numlist[i] >=n) {
        //         int idx=i;
        //     }
        // }
        
        for (int i=0; i<len; i++) {
            arr[i] = Math.abs(numlist[i]-n);
        }
        
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1; 
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == -1) continue;
                
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                } 

                else if (min == arr[j] && numlist[idx] < numlist[j]){
                    min = arr[j];
                    idx = j;
                }
            }
            
            arr[idx] = -1;
            answer[a++] = numlist[idx];
        
        }
        return answer;
    }
}