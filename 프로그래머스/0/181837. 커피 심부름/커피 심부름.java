class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String st : order) {
            answer += (st.contains("cafelatte") ? 5000 : 4500);
        }
        
        return answer;
    }
}