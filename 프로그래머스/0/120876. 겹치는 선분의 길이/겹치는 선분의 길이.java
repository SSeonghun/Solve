class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        
        for (int[] line : lines) {
            arr[line[0]+100]++;
            arr[line[1]+100]--;
        }
        
        for (int i=0; i<200; i++) {
            arr[i+1] += arr[i];
        }
        
        for (int i : arr) {
            if (i>1) {
                answer++;
            }
        }
        
        return answer;
    }
}