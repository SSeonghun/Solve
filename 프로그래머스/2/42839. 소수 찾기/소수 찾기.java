import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>(); 
    
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];
        
        dfs(numbers, "", 0, visited);
        
        for (int i : set) {
            if (isPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }

    public void dfs(String numbers, String number, int level, boolean[] visited) {
        
        if (number.length()<level) {
            return;
        }
        
        for (int i=0; i<numbers.length(); i++) {
            
            if (visited[i]) {
                continue;
            }
            
            set.add(Integer.parseInt(number + numbers.charAt(i)));
            visited[i] = true;
            dfs(numbers, number+numbers.charAt(i), level+1, visited);
            visited[i] = false;
            
        }
        
    }
    
    public boolean isPrime(int number) {
        
        System.out.println(number);
        if (number==0 || number==1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(number); i++) {
            if (number%i==0) {
                return false;
            }
        }
        
        return true;
        
    }
}