class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] bucket = new int[31];
        
        for (String str : strArr) {
            bucket[str.length()]++;
        }
        
        for (int i : bucket) {
            if (answer<i) {
                answer=i;
            }
        }
        
        return answer;
    }
}