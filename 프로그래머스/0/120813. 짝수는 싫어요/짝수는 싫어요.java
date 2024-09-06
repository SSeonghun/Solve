class Solution {
    public int[] solution(int n) {
        int len = n%2==0 ? n/2 : n/2+1;
        int[] answer = new int[len];
        
        int c = 0;
        for (int i=1; i<=n; i+=2) {
            answer[c] = i;
            c++;
        }
        
        return answer;
    }
}