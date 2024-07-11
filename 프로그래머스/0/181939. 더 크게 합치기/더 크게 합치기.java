class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String st_ab = a + "" + b;
        String st_ba = b + "" + a;

        int ab = Integer.parseInt(st_ab);
        int ba = Integer.parseInt(st_ba);
        
        if (ab>=ba) {
            answer = ab;
        } else {
            answer = ba;
        }
        
        return answer;
    }
}