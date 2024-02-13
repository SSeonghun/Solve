t = int(input())

for x in range(1,t+1):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    p = int(input())
    arr2 = [int(input()) for _ in range(p)]
    ans = [0]*5001

    for i in range(n):
        for j in range(arr[i][0]-1, arr[i][1]):
            ans[j]+=1

    print(f'#{x}', end=' ')

    for i in range(p):
        for j in range(5001):
            if arr2[i] == j:
                print(ans[j-1], end=' ')
    print()