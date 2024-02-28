n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
lst = [[0]*1001 for _ in range(1001)]

for i in range(n):
    for j in range(arr[i][0], arr[i][0]+arr[i][2]):
        for k in range(arr[i][1], arr[i][1]+arr[i][3]):
            lst[j][k]=i+1

for k in range(n):
    cnt=0
    for i in range(1001):
        for j in range(1001):
            if lst[i][j]==k+1:
                cnt+=1
    print(cnt)