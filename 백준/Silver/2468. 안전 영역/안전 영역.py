from collections import deque
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
diy = [-1, 1, 0, 0]
dix = [0, 0, -1, 1]
q = deque()
r = 1
Max = 1

while r<=100:
    used = [[0] * n for _ in range(n)]
    cnt=0
    for i in range(n):
        for j in range(n):
            if arr[i][j]>r and used[i][j]==0:
                q.append([i,j])
                used[i][j]=1

                while q:
                    y,x = q.popleft()
                    for k in range(4):
                        dy = y + diy[k]
                        dx = x + dix[k]
                        if 0<=dy<n and 0<=dx<n:
                            if arr[dy][dx]>r and used[dy][dx]==0:
                                q.append([dy,dx])
                                used[dy][dx]=1
                cnt += 1
    r+=1
    if Max<cnt:
        Max = cnt
    if cnt==0:
        break
print(Max)