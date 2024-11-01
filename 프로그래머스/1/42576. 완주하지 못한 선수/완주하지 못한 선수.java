import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String str : participant) {
            if(map.containsKey(str)) {
				Integer value = map.get(str);
				map.put(str, (value.intValue() + 1));
			} else {
				map.put(str, 1);			
			}
        }
        
        for (String str : completion) {
            Integer value = map.get(str);
            map.put(str, (value.intValue() - 1));
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                answer = entry.getKey();
                return answer;
            }
        }
        return answer;
    }
}