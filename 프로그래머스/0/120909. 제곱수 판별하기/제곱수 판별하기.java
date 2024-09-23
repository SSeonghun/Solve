import java.util.*;

class Solution {
    public int solution(int n) {
        
        double num = Math.sqrt(n);
        
        if (num%1==0) {
            return 1;
        }
        
        return 2;
    }
}