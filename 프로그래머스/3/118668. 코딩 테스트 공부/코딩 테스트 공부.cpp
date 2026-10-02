#include <bits/stdc++.h>

using namespace std;

int solution(int alp, int cop, vector<vector<int>> problems) {
    int answer = 0;
    
    int targetAlp = 0;
    int targetCop = 0;
    
    for (auto& p : problems) {
        targetAlp = max(targetAlp, p[0]);
        targetCop = max(targetCop, p[1]);
    }
    
    alp = min(alp, targetAlp);
    cop = min(cop, targetCop);
    
    const int INF = 1E9;
    
    vector<vector<int>> dp(
        targetAlp+1,
        vector<int>(targetCop+1, INF)
    );
    
    dp[alp][cop] = 0;
    
    for(int a = alp; a<=targetAlp; a++) {
        for (int c = cop; c<= targetCop; c++) {
            if (a+1 <= targetAlp) {
                dp[a+1][c] = min(dp[a+1][c], dp[a][c]+1);
            }
            if (c+1 <= targetCop) {
                dp[a][c+1] = min(dp[a][c+1], dp[a][c]+1);
            }
            
            for (auto& p : problems) {
                int alpReq = p[0];
                int copReq = p[1];
                int alpRwd = p[2];
                int copRwd = p[3];
                int cost = p[4];
                
                if (a>=alpReq && c>= copReq) {
                    int nextA = min(targetAlp, a+alpRwd);
                    int nextC = min(targetCop, c+copRwd);
                    dp[nextA][nextC] = min(dp[nextA][nextC], dp[a][c]+cost);
                }
                
            }
        }
    } 
    
    return dp[targetAlp][targetCop];
}