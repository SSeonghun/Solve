class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while (order>0) {
            if (order%10==0) {
            }
         
            else if (order%10%3 == 0) {
                answer++;
            }
            order = order/10;
        }
        
        return answer;
    }
}