class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int c = 0;
        
        for (int i=k; i<=n; i+=k) {
            answer[c] = (i);
            c++;
        }
        return answer;
    }
}