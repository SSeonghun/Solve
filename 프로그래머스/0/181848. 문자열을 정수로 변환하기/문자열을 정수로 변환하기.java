class Solution {
    public int solution(String n_str) {
        int answer = 0;
        String[] arr = n_str.split("");
        int n = n_str.length()-1;
        
        for (int i=0; i<n_str.length(); i++) {
            if (n==0) {
                answer += Integer.parseInt(arr[i]);
            } else{
                answer += Integer.parseInt(arr[i])*Math.pow(10,n);
            }
            n--;
        }
        
        return answer;
    }
}