from collections import deque
n = int(input())
m = int(input())
arr = [[0]*(n+1) for _ in range(n+1)]
for i in range(m):
    a, b = map(int, input().split())
    arr[a][b] = arr[b][a] = 1
used = [0]*(n+1)
used[1] = 1
result = []
cnt = 0
def abc(st):
    global cnt
    q = deque()
    q.append(st)
    while q:
        st = q.popleft()
        cnt+=1
        for i in range(n+1):
            if arr[st][i]==1 and used[i]==0:
                used[i]=1
                q.append(i)

abc(1)
print(cnt-1)