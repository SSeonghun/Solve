from collections import deque
n, m, v = map(int, input().split())
arr = [[0]*(n+1) for _ in range(n+1)]
for i in range(m):
    a, b = map(int, input().split())
    arr[a][b], arr[b][a] = 1, 1
used = [0]*(n+1)
used[v]=1
used1 = [0]*(n+1)
used1[v]=1
def dfs(level, start):
    print(start, end=' ')
    used[start]=1
    if level==n:
        return
    for i in range(n+1):
        if arr[start][i]==1 and used[i]==0:
            dfs(level+1,i)

def bfs(start):
    global cnt
    q = deque()
    q.append(start)
    while q:
        cnt+=1
        st = q.popleft()
        print(st, end=' ')
        if cnt==n:
            break
        for i in range(n+1):
            if arr[st][i]==1 and used1[i]==0:
                used1[i] = 1
                q.append(i)

dfs(0,v)
cnt = 0
print()
bfs(v)