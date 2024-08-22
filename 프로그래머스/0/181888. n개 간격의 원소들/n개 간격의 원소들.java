class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[1+(num_list.length-1)/n];
        int index = 0;
        
        for (int i=0; i<num_list.length; i+=n) {
            answer[index] = num_list[i];
            index++;
        }
        
        return answer;
    }
}