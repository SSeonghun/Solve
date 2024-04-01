import sys
input = sys.stdin.readline
n = int(input())
arr = list(map(int, input().split()))
m = int(input())
arr2 = list(map(int, input().split()))

dic1 = {}
for i in arr:
    if i in dic1:
        dic1[i] += 1
    else:
        dic1[i]=1

for i in arr2:
    if i in dic1:
        print(dic1[i],end=' ')
    else:
        print(0,end=' ')
