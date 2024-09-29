class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[] arr = new double[6];
        
        arr[0] = (double) (dots[0][0]-dots[1][0])/(dots[0][1]-dots[1][1]);
        arr[1] = (double) (dots[0][0]-dots[2][0])/(dots[0][1]-dots[2][1]);
        arr[2] = (double) (dots[0][0]-dots[3][0])/(dots[0][1]-dots[3][1]);
        arr[3] = (double) (dots[1][0]-dots[2][0])/(dots[1][1]-dots[2][1]);
        arr[4] = (double) (dots[1][0]-dots[3][0])/(dots[1][1]-dots[3][1]);
        arr[5] = (double) (dots[2][0]-dots[3][0])/(dots[2][1]-dots[3][1]);
        
        if (arr[0]==arr[5] || arr[1]==arr[4] || arr[2]==arr[3]) {
            answer = 1;
        }
        
        return answer;
    }
}