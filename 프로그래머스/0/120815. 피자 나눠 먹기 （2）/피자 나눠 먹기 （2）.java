class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int gcd = gcd(n, 6);
        
        answer = (n*6/gcd)/6;
        
        return answer;
    }
    
    static int gcd(int n, int m) {
        
        if (m==0) {
            return n;
        }
        
        return gcd(m, n%m);
    }
}