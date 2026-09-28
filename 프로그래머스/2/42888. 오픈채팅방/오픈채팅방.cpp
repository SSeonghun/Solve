#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

vector<string> solution(vector<string> record) {
    unordered_map<string, string> nickname;
    
    for (string r : record) {
        stringstream ss(r);
        
        string command, uid, name;
        ss >> command >> uid;
        
        if (command == "Enter" || command == "Change") {
            ss >> name;
            nickname[uid] = name;
        }
    }
    
    vector<string> answer;
    
    for (string r : record) {
        string command, uid;
        stringstream ss(r);
        
        ss >> command >> uid;
        
        if (command == "Enter") {
            answer.push_back(nickname[uid] + "님이 들어왔습니다.");
        } else if (command == "Leave") {
            answer.push_back(nickname[uid] + "님이 나갔습니다.");
        }
    }
    
    return answer;
}