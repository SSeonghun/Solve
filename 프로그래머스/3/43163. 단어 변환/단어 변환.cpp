#include <bits/stdc++.h>

using namespace std;

bool canChange(const string& a, const string& b) {
    int diff = 0;
    for (int i=0; i<a.size(); i++) {
        if (a[i] != b[i]) {
            diff++;
        } if (diff >1) {
            return false;
        }
    }
    return diff==1;
}

int solution(string begin, string target, vector<string> words) {
    int answer = 0;

    int n = words.size();
    queue<pair<string, int>> q;
    vector<bool> visited(n, false);
    
    q.push({begin, 0});
    
    while (!q.empty()) {
        auto [cur, count] = q.front();
        q.pop();
        
        if (cur == target) {
            return count;
        }
        for (int i=0; i<n; i++) {
            if (visited[i]) {
                continue;
            }
            if (canChange(cur, words[i])) {
                visited[i] = true;
                q.push({words[i], count+1});
            }
        }
    }
    
    return 0;
}