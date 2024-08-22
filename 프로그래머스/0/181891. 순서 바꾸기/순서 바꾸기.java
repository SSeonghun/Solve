class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        int index = 0;
        
        for (int i=0; i<len; i++) {
            if (i<n) {
                answer[i+len-n] = num_list[i];
            } else {
                answer[index] = num_list[i];
                index++;
            }
        }
        
        return answer;
    }
}