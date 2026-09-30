#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<string> operations) {
    vector<int> answer;
    
    multiset<int> s; 
    
    for (string oper : operations) {
        char command = oper[0];
        int num = stoi(oper.substr(2));
        
        if (command == 'I') {
            s.insert(num);
        }
        
        else {
            if (s.empty()) {
                continue;
            }
            if (num==1) {
                auto it = prev(s.end());
                s.erase(it);
            }
            else {
                s.erase(s.begin());
            }
        }
    }
         
        if (s.empty()) {
            return {0,0};
        }
        answer = {*prev(s.end()), *s.begin()};
    
    return answer;
}