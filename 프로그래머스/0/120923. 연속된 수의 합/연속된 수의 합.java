class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int n = total/num;
        
        if (total%num==0) {
            answer[num/2] = n;
            for (int i=0; i<num; i++) {
                answer[i] = n-(num/2-i);
            }
        } else {
            answer[num/2-1] = n;
            for (int i=0; i<num; i++) {
                answer[i] = n-(num/2-1-i);
            }
        }
        
        
        
        return answer;
    }
}