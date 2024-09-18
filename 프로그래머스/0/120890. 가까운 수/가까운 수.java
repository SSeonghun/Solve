class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        
        for (int i: array) {
            if (min>Math.abs(i-n)) {
                answer = i;
                min = Math.abs(i-n);
            } else if (min == Math.abs(i-n)) {
                answer = Math.min(i,answer);
            }
        }
        
        return answer;
    }
}