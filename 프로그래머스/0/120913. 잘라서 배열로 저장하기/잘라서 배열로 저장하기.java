class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[len%n==0 ? len/n : len/n+1];
        
        for (int i=0; i<answer.length; i++) {
            if (i==answer.length-1) {
                answer[answer.length-1] = my_str.substring(i*n);
            }
             else {
                answer[i] = my_str.substring(i*n, (i+1)*n);
             } 
            
        }
        
        
        
        return answer;
    }
}