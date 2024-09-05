class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer3 = (numer1*denom2)+(numer2*denom1);
        int denom3 = denom1*denom2;
        
        int i = denom3;
        
        while (i!=1) {
            if (numer3%i==0 && denom3%i==0) {
                numer3 = numer3/i;
                denom3 = denom3/i;
            }
            i--;
        }
        
        answer[0] = numer3;
        answer[1] = denom3;
        
        return answer;
    }
}