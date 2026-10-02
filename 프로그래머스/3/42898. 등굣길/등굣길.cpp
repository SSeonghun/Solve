#include <bits/stdc++.h>

using namespace std;

int solution(int m, int n, vector<vector<int>> puddles) {
    int answer = 0;
    
    const int MOD = 1000000007;
    
    vector<vector<int>> dp(n+1, vector<int>(m+1, 0));
    vector<vector<int>> blocked(n+1, vector<int>(m+1,0));
    
    for (auto& p : puddles) {
        int x = p[0];
        int y = p[1];
        
        blocked[y][x] = true;
    }
    
    dp[1][1] = 1;
    
    for (int y=1; y<=n; y++) {
        for (int x=1; x<=m; x++) {
            if (x==1 && y==1) {
                continue;
            }
            if (blocked[y][x]) {
                dp[y][x] = 0;
                continue;
            }
            dp[y][x] = (dp[y-1][x] + dp[y][x-1]) % MOD;
        }
    }
    
    
    return dp[n][m];
}