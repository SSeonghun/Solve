class Solution {
    
    static boolean[] visited;
    static int count = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        boolean flag = false;
        visited = new boolean[words.length];
        
        for (String word : words) {
            if (word.equals(target)) {
                flag = true;
            }
        }
        
        if (!flag) {
            return 0;
        }
        
        dfs(begin, target, words, 0);
        
        return count == Integer.MAX_VALUE ? 0 : count;
    }
    
    public void dfs(String begin, String target, String[] words, int level) {
        
        if (begin.equals(target)) {
            count = Math.min(count, level);
            return;
        }
        
        
        for (int i=0; i<words.length; i++) {
            int check = 0;
            if (visited[i]) {
                continue;
            }
            for (int j=0; j<words[i].length(); j++) {
                // if (begin.charAt(j) != words[i].charAt(j) && target.charAt(j) == wordss[i].charAt(j)) {
                //     check++;
                // } else if (begin.charAt(j) != words[i].charAt(j) && target.charAt(j) != wordss[i].charAt(j)) {
                //     continue;
                // }
                if (begin.charAt(j) != words[i].charAt(j)) {
                    check++;
                }
            }
            if (check==1) {
                visited[i] = true;
                dfs(words[i], target, words, level+1);
                visited[i] = false;
            }
        }
    }
}