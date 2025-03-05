class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int n = (brown+4)/2;
        
        for (int i=3; i<n; i++) {
            if ((i-2) * (n-i-2) == yellow) {
                System.out.println(i);
                answer[1] = i;
                answer[0] = n-i;
                
                return answer;
            }
        }
        return answer;
    }
}