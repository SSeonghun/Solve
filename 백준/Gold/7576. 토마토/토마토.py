from collections import deque

m, n = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]


diy = [-1, 1, 0, 0]
dix = [0, 0, -1, 1]

q = deque()

for i in range(n):
    for j in range(m):
        if arr[i][j]==1:
            q.append([i,j,0])

while q:
    y, x, cnt = q.popleft()

    for i in range(4):
        dy = y + diy[i]
        dx = x + dix[i]
        if 0<=dy<n and 0<=dx<m and arr[dy][dx]==0:
            arr[dy][dx]=1
            q.append([dy,dx,cnt+1])

flag = 0

for i in range(n):
    for j in range(m):
        if arr[i][j]==0:
            flag=1
            break
    if flag:
        break
if flag:
    print(-1)
else:
    print(cnt)