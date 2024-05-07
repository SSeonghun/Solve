n = int(input())
a, b = map(int, input().split())
m = int(input())
arr = [[0]*(n+1) for _ in range(n+1)]
used = [[0]*(n+1) for _ in range(n+1)]

for i in range(m):
    x,y = map(int, input().split())
    arr[x][y]=1
    arr[y][x]=1

ans = -1
flag = 0
def dfs(x,y,cnt):
    global ans, flag
    if flag: return
    for i in range(n+1):
        if arr[x][i]==1 and used[x][i]==0:
            if i==y:
                ans = cnt
                flag=1
                return
            used[x][i]=1
            used[i][x]=1
            dfs(i,y,cnt+1)
            used[x][i]=0

dfs(a,b,1)
print(ans)