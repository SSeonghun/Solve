import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        while (true) {
            boolean flag = true;
            
            for (int i=2; i<=a; i++) {
                if (a%i==0 && b%i==0) {
                    a = a/i;
                    b = b/i;
                    flag = false;
                }
            }
            
            if (flag) {
                break;
            }
            
        }
        
        
        while (b>1) {
            boolean flag = true;
            
            if (b%2==0) {
                b = b/2;
                flag = false;
            }
            if (b%5==0) {
                b=b/5;
                flag = false;
            }
            
            if (flag) {
                break;
            }
            
        }
        
        if (b>1) {
            answer = 2;
        }
        
        return answer;
    }
}