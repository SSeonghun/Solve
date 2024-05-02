from collections import deque
def solution(maps):
    n = len(maps)
    m = len(maps[0])
    
    diy = [-1, 1, 0, 0]
    dix = [0, 0, -1, 1]
    
    cnt = 1
    q = deque()
    q.append([0,0, cnt])
    
    used = [[0]*m for i in range(n)]
    used[0][0] = 1
    
    flag = 0
    
    while q:
        y, x, cnt = q.popleft()
        cnt+=1
        for i in range(4):
            dy = y + diy[i]
            dx = x + dix[i]
            if 0<=dy<n and 0<=dx<m and maps[dy][dx]==1 and used[dy][dx]==0:
                q.append([dy,dx, cnt])
                used[dy][dx]=1
                if dy==n-1 and dx==m-1:
                    flag=1
                    break
        if flag==1:
            break
                    
    if flag==0:
        answer = -1
    else:
        answer = cnt
    
    
    
    return answer
