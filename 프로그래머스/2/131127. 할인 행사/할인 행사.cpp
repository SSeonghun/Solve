#include <bits/stdc++.h>

using namespace std;

int solution(vector<string> want, vector<int> number, vector<string> discount) {
    int answer = 0;
    
    unordered_map<string, int> need;
    
    for (int i=0; i<want.size(); i++) {
        need[want[i]] = number[i];
    }
    
    unordered_map<string, int> current;
    
    for (int i=0; i<10; i++) {
        current[discount[i]] ++;
    }
    
    if (current == need) {
        answer++;
    }
    
    int left = 0;
    for (int i=10; i<discount.size(); i++) {
        current[discount[left]]--;
        if (current[discount[left]] == 0) {
    current.erase(discount[left]);
}
        current[discount[i]]++;
        left++;
            if (current == need) {
        answer++;
    }
    }
    
    return answer;
}