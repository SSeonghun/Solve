import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == arr1[i%arr1.length]) {
                score[0]++;
            }
            if (answers[i] == arr2[i%arr2.length]) {
                score[1]++;
            }
            if (answers[i] == arr3[i%arr3.length]) {
                score[2]++;
            }
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        for (int i=0; i<3; i++) {
            if (score[i]==maxScore) {
                answer.add(i+1);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
    
    
}