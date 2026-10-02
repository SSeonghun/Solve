#include <bits/stdc++.h>

using namespace std;

int solution(int N, int number) {
    int answer = 0;
    
    vector<set<int>> dp(9);
    
    int cur = 0;
    
    for (int i=1; i<9; i++) {
        cur = cur*10 + N;
        dp[i].insert(cur);
    }
    
    for (int i=1; i<9; i++) {
        for (int j=1; j<i; j++) {
            for (int a : dp[j]) {
                for (int b : dp[i-j]) {
                    dp[i].insert(a+b);
                    dp[i].insert(a-b);
                    dp[i].insert(a*b);
                    if (b!=0) {
                        dp[i].insert(a/b);
                    }
                }
            }
        }
                    if (dp[i].find(number) != dp[i].end()) {
                return i;
            }
    }
    
    return -1;
}