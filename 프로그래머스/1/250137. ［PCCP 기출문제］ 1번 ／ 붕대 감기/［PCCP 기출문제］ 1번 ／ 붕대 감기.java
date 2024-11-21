class Solution {
    
    static int bandageTime;
    static int heal;
    static int heal2;
    static int fullHealth;
    static int answer;
    
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        bandageTime = bandage[0];
        heal = bandage[1];
        heal2 = bandage[2];
        fullHealth = health;
        answer = health;
        
        dfs(attacks, 0, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[][] attacks, int count, int healCount, int attackCount) {
        count++;
        
        if (attacks[attacks.length-1][0]<count) {
            return;
        }
        
        if (attacks[attackCount][0] == count) {
            answer -= attacks[attackCount][1];
            attackCount++;
            healCount=0;
            if (answer<=0) {
                answer = -1;
                return;
            }
        }
        
        else if (answer<fullHealth) {
            answer+=heal;
            healCount++;
            
            if (healCount == bandageTime) {
                answer+=heal2;
                healCount = 0;
            }
            if (answer>fullHealth) {
                answer = fullHealth;
            }
        }
        
        dfs(attacks, count, healCount, attackCount);
    }
    
}