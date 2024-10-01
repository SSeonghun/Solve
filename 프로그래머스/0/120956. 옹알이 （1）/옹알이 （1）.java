class Solution {
    public int solution(String[] babbling) {
        int answer = babbling.length;
        
        for (String st : babbling) {
            String st2 = st.replaceAll("aya|ye|woo|ma","");
            if (st2.length()>0) {
                answer--;
            }
        }
        
        return answer;
    }
}