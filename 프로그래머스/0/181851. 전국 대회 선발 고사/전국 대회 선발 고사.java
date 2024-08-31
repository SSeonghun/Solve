class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int count = 0;
        
        int first = 101;
        int second = 101;
        int third = 101;
        
        int f = 0;
        int s = 0;
        int t = 0;
        
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                if (rank[i]<first) {
                    third = second;
                    second = first;
                    first = rank[i];
                    t=s;
                    s=f;
                    f=i;
                } else if (rank[i]<second) {
                    third = second;
                    second = rank[i];
                    t=s;
                    s=i;
                } else if (rank[i]<third) {
                    third = rank[i];
                    t=i;
                }
            }
        }
        
        answer = 10000*f + 100*s + t;
        
        return answer;
    }
}