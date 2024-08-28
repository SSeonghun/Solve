import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        String str = "";
        
        for (int i=0; i<myStr.length(); i++) {
            if (myStr.charAt(i)!='a' && myStr.charAt(i)!='b' && myStr.charAt(i)!='c') {                
                str += myStr.charAt(i);
                if (i==myStr.length()-1) {
                    answer.add(str);
                }
            } else {
                if (!str.equals("")) {
                    
                    answer.add(str);
                    str = "";
                }
            }
        }
        
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        
        return answer.toArray(new String[0]);
    }
}