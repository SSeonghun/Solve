class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        
        dfs(numbers, target, 0, 0);
        return answer;
        
    }
    public void dfs(int[] numbers, int target, int n, int sum) {
            if (n==numbers.length) {
                if (target==sum) {
                    answer++;
                }       
            } else {
                dfs(numbers, target, n+1, sum+numbers[n]);
                dfs(numbers, target, n+1, sum-numbers[n]);
            }
        }
}