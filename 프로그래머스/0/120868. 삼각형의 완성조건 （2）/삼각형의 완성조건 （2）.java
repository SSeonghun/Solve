class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0] > sides[1] ? sides[0] : sides[1];
        int b = sides[0] < sides[1] ? sides[0] : sides[1];
        
        answer += b;
        answer += a+b-a-1;
        
        
        return answer;
    }
}