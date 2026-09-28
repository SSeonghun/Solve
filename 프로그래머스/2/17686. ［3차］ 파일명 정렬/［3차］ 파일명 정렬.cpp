#include <bits/stdc++.h>

using namespace std;

struct File {
    string original;
    string head;
    int number;
};

vector<string> solution(vector<string> files) {
    vector<string> answer;
    
    vector<File> v;
    
    for (string s : files) {
        int idx = 0;
        
        while (idx < s.size() && !isdigit(s[idx])) {
            idx++;
        }
        
        string head = s.substr(0, idx);
        string lowerHead = head;
        
        for (char& c : lowerHead) {
            c = tolower(c);
        }
        
        int start = idx;
        
        while (idx < s.size() && isdigit(s[idx])) {
            idx ++;
        }
        
        int number = stoi(s.substr(start, idx - start));
        
        v.push_back({
            s, lowerHead, number
        });
    }
    
    stable_sort(
        v.begin(),
        v.end(),
        [](const File& a, const File& b) {
            if (a.head != b.head) {
                return a.head < b.head;
            } 
            return a.number < b.number;
        }
    );
    
    for (auto& file : v) {
        answer.push_back(file.original);
    }
    
    return answer;
}