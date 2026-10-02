#include <bits/stdc++.h>

using namespace std;

long long solution(int n, vector<int> times) {
    
    long long left = 1;
    long long right = (long long)*min_element(times.begin(), times.end()) * n;
    
    long long answer = right;
    
    while (left<=right) {
        long long mid = (left + right)/2;
        long long people = 0;
        for (int time : times) {
            people += mid/time; 
        }
        if (people<n) {
            left = mid+1;
        } else {
            answer = mid;
            right = mid-1;
        }
    }
    
    return answer;
}