#include <bits/stdc++.h>

using namespace std;

struct plan {
    string name;
    int start;
    int play;
};

int toMinute(string time) {
    int hour = stoi(time.substr(0,2));
    int minute = stoi(time.substr(3,2));
    
    return hour*60+minute;
}


vector<string> solution(vector<vector<string>> plans) {
    vector<string> answer;
    
    vector<plan> v;
    
    for (auto& plan : plans) {
        v.push_back({plan[0], toMinute(plan[1]), stoi(plan[2])});
    }
    
    sort(v.begin(), v.end(),
         [](const auto& a, const auto& b) {
             return a.start < b.start;
         });
        
    stack<pair<string, int>> st;
    
    for (int i=0; i<plans.size()-1; i++) {
        int available = v[i+1].start - v[i].start;
        
        if (v[i].play <= available) {
            answer.push_back(v[i].name);
            
            available -= v[i].play;
            
            while (available>0 && !st.empty()) {
                auto p = st.top();
                st.pop();
                
                string name = p.first;
                int remain = p.second;
                
                if (remain <= available) {
                    answer.push_back(name);
                    available -= remain;
                } else {
                    remain -= available;
                    st.push({name, remain});
                    available = 0;
                }
            }
        } else {
            int remain = v[i].play - available;
            st.push({
                v[i].name, remain
            });
        }
    }
    
    answer.push_back(v.back().name);
    
    while (!st.empty()) {
        answer.push_back(st.top().first);
        st.pop();
    }
    
    return answer;
}