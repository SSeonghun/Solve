#include <bits/stdc++.h>

using namespace std;

int solution(vector<vector<int>> routes) {
    int answer = 0;
    
       sort(routes.begin(), routes.end(),
         [](const auto& a, const auto& b) {
             return a[1] < b[1];
         });
    
    int camera = INT_MIN;
    
    for (auto& route : routes) {
        int start = route[0];
        int end = route[1];
        
        if (start > camera) {
            camera = end;
            answer++;
        }
    }
    
    return answer;
}