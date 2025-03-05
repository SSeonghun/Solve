import java.util.*;

class Solution {
    
    static List<String> li;
    
    public int solution(String word) {
        int answer = 0;
        li = new ArrayList<>();
        
        dfs("AEIOU", "");
        
        answer = li.indexOf(word);
        
        return answer;
    }
    
    public void dfs(String word, String w) {
        
        li.add(w);
        
        if (w.length()==5) {
            return;
        }
        
        for (int i=0; i<5; i++) {
            
            dfs(word, w+word.charAt(i));
            
        }
    }
}