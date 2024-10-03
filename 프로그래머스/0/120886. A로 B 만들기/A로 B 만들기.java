class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        
        for (int i=0; i<before.length(); i++) {
            arr[before.charAt(i)-'a']++;
            arr2[after.charAt(i)-'a']++;
        }
        
        for (int i=0; i<26; i++) {
            if (arr[i] != arr2[i]) {
                return 0;
            }
        }
        
        return answer;
    }
}