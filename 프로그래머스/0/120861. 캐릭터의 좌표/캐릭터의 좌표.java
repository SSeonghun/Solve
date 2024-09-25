class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int garo = (board[0]-1)/2;
        int sero = (board[1]-1)/2;
        
        for (String st : keyinput) {
            if (st.equals("up")) {
                if (-sero <= answer[1]+1 && answer[1]+1 <= sero) {
                    answer[1]++;
                }
                
            } else if (st.equals("down")) {
                if (-sero <= answer[1]-1 && answer[1]-1 <= sero) {
                    answer[1]--;
                }
            } else if (st.equals("left")) {
                if (-garo <= answer[0]-1 && answer[0]-1 <= garo) {
                    answer[0]--;
                }
            } else if (st.equals("right")) {
                if (-garo <= answer[0]+1 && answer[0]+1 <= garo) {
                    answer[0]++;
                }
            }
        }
        return answer;
    }
}