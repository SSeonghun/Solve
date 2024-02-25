from collections import deque
t = int(input())

for x in range(1, t+1):
    n, m = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]

    def bfs(y,x):
        q = deque()
        q.append([y,x])
        cnt1 = 1
        cnt2 = 1
        while q:
            y, x = q.popleft()
            dy = y + 1
            dx = x

            if 0<=dy<n and 0<=dx<m and arr[dy][dx]==1:
                q.append([dy,dx])
                cnt1+=1
        q.append([y, x])
        while q:
            y, x = q.popleft()
            dy = y
            dx = x + 1

            if 0 <= dy < n and 0 <= dx < m and arr[dy][dx] == 1:
                q.append([dy, dx])
                cnt2 += 1

        if cnt1<cnt2:
            cnt1=cnt2
        return cnt1

    Max = 0
    for i in range(n):
        for j in range(m):
            if arr[i][j]==1:
                ret = bfs(i,j)
                if Max < ret:
                    Max = ret

    print(f'#{x} {Max}')