class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String st_ab = String.valueOf(a) + String.valueOf(b);
        int ba = 2*a*b;
        
        int ab = Integer.parseInt(st_ab);
        
        if (ab>=ba) {
            answer = ab;
        } else {
            answer = ba;
        }
            
        return answer;
    }
}