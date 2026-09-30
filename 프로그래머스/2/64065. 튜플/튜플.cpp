#include <bits/stdc++.h>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer;
    
    vector<vector<int>> groups;
    vector<int> current;
    
    string num;
    
    for (int i=1; i<s.size()-1; i++) {
        if (isdigit(s[i])) {
            num += s[i];
        }else {
        if (!num.empty()) {
            current.push_back(stoi(num));
            num = "";
        }
        
        if (s[i] == '}') {
            if (!current.empty()) {
                groups.push_back(current);
                current.clear();
            }
        }
    }
    }
    
    
    sort(groups.begin(), groups.end(),
        [](const auto& a, const auto& b) {
           return a.size() < b.size(); 
        });
    
    unordered_set<int>used;
    
    for (auto& group : groups) {
        for (int x : group) {
            if (used.find(x) == used.end()) {
                answer.push_back(x);
                used.insert(x);
                break;
            }
        }
    }
    
    return answer;
}