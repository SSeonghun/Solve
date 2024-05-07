from collections import deque

n, k = map(int, input().split())
ans = 0
used = [0]*100001

def bfs(x, t):
    global ans
    q = deque()
    q.append([x, t])

    while q:
        x, t = q.popleft()
        if x==k:
            ans = t
            break
        dix = [1, -1, x*2-x]
        for i in range(3):
            dx = x + dix[i]
            if 0<=dx<=100000 and used[dx]==0:
                used[dx]=1
                q.append([dx, t+1])

bfs(n,0)
print(ans)
