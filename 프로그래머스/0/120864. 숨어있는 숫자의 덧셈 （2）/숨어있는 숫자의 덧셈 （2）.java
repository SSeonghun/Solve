class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";
        
        for (char c : my_string.toCharArray()) {
            if (c>'9') {
                if (!num.equals("")) {
                    answer += Integer.parseInt(num);
                    num="";
                } else {
                    continue;
                }
            } else {
                num += c;
            }
        }
        
        if (!num.equals("")) {
            answer += Integer.parseInt(num);
        }
        
        
        return answer;
    }
}