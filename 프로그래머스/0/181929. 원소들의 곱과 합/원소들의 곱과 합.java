class Solution {
    public int solution(int[] num_list) {
        int gob = 1;
        int sum = 0;
        
        for (int i=0; i<num_list.length; i++) {
            gob *= num_list[i];
            sum += num_list[i];
        }
        if (gob<sum*sum) {
            return 1;
        } else {
            return 0;
        }
    }
}