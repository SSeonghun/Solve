#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<string> genres, vector<int> plays) {
    vector<int> answer;
    
    unordered_map<string, int> total;
    unordered_map<string, vector<pair<int, int>>> songs;
    int n = genres.size();
    
    for (int i=0; i<n; i++) {
        total[genres[i]] += plays[i];
        songs[genres[i]].push_back({plays[i],i});
    }
    
   vector<pair<string, int>> genreOrder;
    
    for (auto& [genre, sum] : total) {
        genreOrder.push_back({genre, sum});
    }
    
    sort(genreOrder.begin(), genreOrder.end(),
         [](const auto& a, const auto& b) {
             return a.second>b.second;
         }
    );
    
    for (auto& [genre, sum] : genreOrder) {
        auto& v = songs[genre];
        
        sort(v.begin(), v.end(),
            [](const auto& a, const auto& b) {
               if (a.first != b.first) {
                   return a.first > b.first;
               } return a.second < b.second;
            }
            );
        answer.push_back(v[0].second);
        if (v.size()>=2) {
            answer.push_back(v[1].second);
        }
    }
    
    return answer;
}