class Solution {
    public int solution(int n) {
        int answer = 0;
        int fact = 1;
        
        while (fact<=n) {
            answer++;
            fact*=answer;
        }
        
        return answer-1;
    }
}