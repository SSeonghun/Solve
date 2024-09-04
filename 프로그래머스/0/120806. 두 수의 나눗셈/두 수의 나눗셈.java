class Solution {
    public int solution(int num1, int num2) {
        double n1 = (double)num1;
        double n2 = (double)num2;
        
        int answer = (int)(n1/n2*1000);

        return answer;
    }
}