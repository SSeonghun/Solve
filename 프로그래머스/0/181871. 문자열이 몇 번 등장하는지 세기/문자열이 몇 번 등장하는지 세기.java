class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i=0; i<=myString.length()-pat.length(); i++) {
            if (myString.charAt(i) == pat.charAt(0)) {
                boolean flag = true;
                for (int j=0; j<pat.length(); j++) {
                    if (myString.charAt(i+j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}