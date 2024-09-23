class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String n = String.valueOf(num);
        
        if (n.indexOf(String.valueOf(k))!=-1) {
            return n.indexOf(String.valueOf(k))+1;
        }
        
        return n.indexOf(String.valueOf(k));
    }
}