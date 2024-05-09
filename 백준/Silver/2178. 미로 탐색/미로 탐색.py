from collections import deque

n, m = map(int, input().split())
arr = [list(map(int, input())) for _ in range(n)]
used = [[0]*m for _ in range(n)]
used[0][0]=1
diy = [-1, 1, 0, 0]
dix = [0, 0, -1, 1]
ans = 0
def bfs(x,y,cnt):
    global ans
    q = deque()
    q.append([x,y,cnt])

    while q:
        x, y, cnt= q.popleft()
        if x == m-1 and y==n-1:
            ans=cnt
        for i in range(4):
            dy = y + diy[i]
            dx = x + dix[i]
            if 0<=dy<n and 0<=dx<m and arr[dy][dx]==1 and used[dy][dx]==0:
                used[dy][dx]=1
                q.append([dx,dy,cnt+1])

bfs(0,0,1)

print(ans)