import java.util.*;

class Solution {
    
    static boolean[] visited;
    static String[] answer;
    
    public String[] solution(String[][] tickets) {
        int n = tickets.length;
        answer = new String[n+1];
        visited = new boolean[n];
        
        answer[0] = "ICN";
        
        Arrays.sort(tickets, (a,b) -> a[1].compareTo(b[1]));
        
        
        dfs(tickets, 0, 1);

        return answer;
    }
    
    public static boolean dfs(String[][] tickets, int idx, int depth) {
        
        
        System.out.println(depth + " " + idx);
        
        if (depth == tickets.length+1) {
            return true;
        }
        
        if (depth==1) {
            for (int i=0; i<tickets.length; i++) {
                if (tickets[i][0].equals("ICN")) {
                    visited[i] = true;
                    answer[depth] = tickets[i][1];
                    if (dfs(tickets, i, depth+1)) {
                        return true;
                    }

                    visited[i] = false;
                }
            }
        }
        else {
            for (int i=0; i<tickets.length; i++) {
                if (visited[i]==false && tickets[i][0].equals(tickets[idx][1])) {
                    visited[i] = true;
                    answer[depth] = tickets[i][1];
                    if (dfs(tickets, i, depth+1)) {
                        return true;
                    }
                    visited[i] = false;
                }
            }
        }
        return false;
    }
}