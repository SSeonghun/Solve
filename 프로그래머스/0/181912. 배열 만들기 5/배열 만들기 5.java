import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i=0; i<intStrs.length; i++) {
            String str = intStrs[i];
            StringBuilder intStr = new StringBuilder();
            
            for (int j=s; j<s+l; j++) {
                intStr.append(str.charAt(j));
            }
            int ans = Integer.parseInt(intStr.toString());
            
            if (ans>k) {
                answer.add(ans);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}