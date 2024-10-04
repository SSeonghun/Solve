class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        A = A+A;
        
        for (int i=0; i<B.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(A.substring(B.length()-i, B.length()));
            sb.append(A.substring(0,B.length()-i));
            
            answer++;
            if (sb.toString().equals(B)) {
                return answer;
            }
                      
        }
        
        return -1;
    }
}