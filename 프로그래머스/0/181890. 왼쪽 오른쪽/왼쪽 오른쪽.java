import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                if (i==0) {
                    break;
                }
                for (int j=0; j<i; j++) {
                    answer.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r") && i!=str_list.length-1) {
                for (int j=i+1; j<str_list.length; j++) {
                    answer.add(str_list[j]);
                }
                break;
            }
        }
        
        return answer.toArray(new String[0]);
    }
}