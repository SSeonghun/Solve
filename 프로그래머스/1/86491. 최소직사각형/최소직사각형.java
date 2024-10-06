class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        
        for (int[] arr : sizes) {
            for (int i : arr) {
                if (max1<i) {
                    max1 = i;
                }
            }
        }
        
        for (int[] arr :sizes) {
            if (arr[0]>arr[1]) {
                if (max2<arr[1]) {
                    max2 = arr[1];
                }
            } else {
                if (max2<arr[0]) {
                    max2 = arr[0];
                }
            }
        }
        
        answer = max1 * max2;
        
        return answer;
    }
}