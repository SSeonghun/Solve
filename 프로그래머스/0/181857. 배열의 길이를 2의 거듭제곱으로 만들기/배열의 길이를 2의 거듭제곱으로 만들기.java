class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        double len = arr.length;
        int count = 1;
        
        while (len>1) {
            len = len/2;
            count = count*2;
        }
        
        if (len==1) {
            answer = arr;
        } else {
            answer = new int[count];
            for (int i=0; i<count; i++) {
                if (i<arr.length) {
                    answer[i]=arr[i];
                } else {
                    answer[i]=0;
                }
            }
        }
        
        return answer;
    }
}