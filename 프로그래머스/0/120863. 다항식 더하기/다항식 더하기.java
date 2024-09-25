class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        
        int num = 0;
        int sum = 0;
        
        for (String st : arr) {
            if (st.charAt(st.length()-1) == 'x') {
                if (st.charAt(0) == 'x') {
                    sum++;
                } else {
                    String str = st.substring(0,st.length()-1);
                    sum += Integer.parseInt(str);
                } 
            } else if (st.equals("+")) {
                continue;
            }
            else {
                int n = Integer.parseInt(st);
                num+=n;
            }
        } 
        
        if (sum!=0) {
            if (sum==1) {
                answer += "x";
                if (num != 0) {
                    answer += " + ";
                    answer += String.valueOf(num);
                }
            }
            else {
                answer += String.valueOf(sum);
                answer += "x";
                if (num != 0) {
                    answer += " + ";
                    answer += String.valueOf(num);
                }
            }
            
        } else {
            answer += String.valueOf(num);
        }
        
        return answer;
    }
}