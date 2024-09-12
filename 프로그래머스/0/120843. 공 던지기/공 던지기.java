class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        
        int idx = (1 + 2*(k-1))%numbers.length-1;
        
        if (idx==-1) {
            idx = numbers.length-1;
        }
        
        answer = numbers[idx];
        
        return answer;
    }
}