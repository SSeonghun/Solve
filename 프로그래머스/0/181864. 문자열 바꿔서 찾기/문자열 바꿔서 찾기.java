class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String st = "";
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                st += 'B';
            } else {
                st += 'A';
            }
        }
        
        if (st.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}