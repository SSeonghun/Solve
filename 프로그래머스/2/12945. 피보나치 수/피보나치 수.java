class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp2 = 0;
        int temp1 = 1;
        answer = 1;
        
        
        for (int i=2; i<=n; i++) {
            answer = (temp1+temp2)%1234567;
            temp2 = temp1;
            temp1 = answer;
        } 
        
        
        return answer;
    }
}