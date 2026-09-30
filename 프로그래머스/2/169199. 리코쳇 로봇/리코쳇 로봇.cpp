#include <bits/stdc++.h>

using namespace std;

int solution(vector<string> board) {
    int answer = 0;
    
    vector<int> dx = {-1, 1, 0, 0};
    vector<int> dy = {0, 0, -1, 1};
    
    int n = board.size();
    int m = board[0].size();
    
    queue<pair<int, int>> q;
    vector<vector<int>> dist(n, vector<int>(m, -1));
    
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            if (board[i][j]=='R') {
                q.push({i, j});
                dist[i][j] = 0;
            }
        }
    }
    
    while (!q.empty()) {
        
        auto [dix, diy] = q.front();
        q.pop();
        
        if (board[dix][diy] == 'G') {
            return dist[dix][diy];
        }
        
        for (int i=0; i<4; i++) {
            int nx = dix;
            int ny = diy;
            
            while (true) {
                int nextX = nx + dx[i];
                int nextY = ny + dy[i];
                
                if (nextX>=0 && nextX<n && nextY>=0 && nextY<m && board[nextX][nextY]!='D') {
                    nx = nextX;
                    ny = nextY;
                } else {
                break;
            }
            }
            if (dist[nx][ny] == -1) {
                dist[nx][ny] = dist[dix][diy]+1;
                q.push({nx, ny});
            }
        }
    }
    
    return -1;
}