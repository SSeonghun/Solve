#include <bits/stdc++.h>

using namespace std;



vector<int> solution(vector<string> maps) {
    vector<int> answer;
    
    int n = maps.size();
    int m = maps[0].size();
    
    vector<int> dx = {-1, 1, 0, 0};
    vector<int> dy = {0, 0, -1, 1};
    
    vector<vector<bool>> visited(n, vector<bool>(m, false));
    vector<vector<int>> arr(n,vector<int>(m));
                                 
    queue<pair<int, int>> q;
    
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            if (!isdigit(maps[i][j])) {
                arr[i][j] = -1;
            } else {
                arr[i][j] = maps[i][j] - '0';
            }
        }
    }
    
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            
            int sum = 0;
            
            if (arr[i][j] != -1) {
                
                if (visited[i][j]) {
                    continue;
                }
                visited[i][j] = true;
                q.push({i, j});
                
                while (!q.empty()) {
                    auto [a, b] = q.front();
                    q.pop();
                    sum+=arr[a][b];
                    for (int k=0; k<4; k++) {
                        int cx = a + dx[k];
                        int cy = b + dy[k];
                        if (cx>=0 && cx<n && cy>=0 && cy<m && !visited[cx][cy] && arr[cx][cy] != -1) {
                            q.push({cx, cy});
                            visited[cx][cy] = true;
                        }
                    }
                }
                answer.push_back(sum);
            }
        }
    }
    
    if (answer.empty()) {
        return {-1};
    }
    
    sort(answer.begin(), answer.end());
    
    return answer;
}