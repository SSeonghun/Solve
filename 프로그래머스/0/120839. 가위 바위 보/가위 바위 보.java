import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        map.put("2", "0");
        map.put("0", "5");
        map.put("5", "2");
        
        String[] arr = rsp.split("");
        
        for (String st: arr) {
            answer+= map.get(st);
        }
        
        
        return answer;
    }
}