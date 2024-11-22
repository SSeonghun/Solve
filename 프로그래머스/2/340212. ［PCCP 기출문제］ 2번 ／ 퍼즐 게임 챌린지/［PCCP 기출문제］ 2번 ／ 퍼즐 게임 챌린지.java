class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int max = 300000;
        int min = 1;
        long sum = 0;
        
        while (min<max) {
            int level = (max+min)/2;
            sum = 0;
            for (int i=0; i<diffs.length; i++) {
                if (diffs[i]<=level) {
                    sum+=times[i];
                }else {
                    sum += (diffs[i]-level)*(times[i]+times[i-1]) + times[i];
                }
                if (sum>limit) {
                    break;
                }
            }
            if (sum<=limit) {
                max = level;
            } else {
                min = level+1;
            }
        }
        
        
        return max;
    }
}