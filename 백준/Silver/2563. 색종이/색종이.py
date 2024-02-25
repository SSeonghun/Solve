n = int(input())
arr = [[0]*100 for _ in range(100)]

for i in range(n):
    a, b = map(int, input().split())
    for j in range(a, a+10):
        for k in range(b, b+10):
            if 0<=j<100 and 0<=k<100:
                arr[j][k]=1

cnt = 0
for i in range(100):
    for j in range(100):
        if arr[i][j]==1:
            cnt+=1

print(cnt)

