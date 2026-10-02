#include <bits/stdc++.h>

using namespace std;

bool dfs(string cur,
        vector<vector<string>>& tickets,
        vector<bool>& visited,
        vector<string>& answer) {
    
    if (answer.size() == tickets.size()+1) {
        return true;
    }
    for (int i=0; i<tickets.size(); i++) {
        if (visited[i]) {
            continue;
        }
        if (tickets[i][0] != cur) {
            continue;
        }
        
        visited[i] = true;
        answer.push_back(tickets[i][1]);
        
        if (dfs(tickets[i][1], tickets, visited, answer)) {
            return true;
        }
        answer.pop_back();
            visited[i] = false;
    }
    return false;
}

vector<string> solution(vector<vector<string>> tickets) {
    vector<string> answer;
    
    sort(tickets.begin(), tickets.end());
    vector<bool> visited(tickets.size(), false);
    answer.push_back("ICN");
    dfs("ICN", tickets, visited, answer);
    
    return answer;
}