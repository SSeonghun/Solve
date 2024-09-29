class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[100];
        int count = 1;
        
        for (int i=0; i<100; i++) {
            arr[i] = count;
            count++;
            while (count%3==0 || count%10==3 || count/10==3 || count/10==13) {
                count++;
            }
        }
        
        answer = arr[n-1];
        
        return answer;
    }
}