class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double Sum = 0;
        
        for (int i : numbers) {
            Sum += i;
        }
        
        answer = Sum/numbers.length;
        
        return answer;
    }
}