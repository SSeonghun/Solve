arr = [[0]*101 for _ in range(101)]
n = int(input())

for i in range(n):
    a, b = map(int, input().split())
    for j in range(a, a + 10):
        for k in range(b, b + 10):
            if 0 <= j < 100 and 0 <= k < 100:
                arr[j][k] = 1

directy = [-1, 1, 0, 0]
directx = [0, 0, -1, 1]

cnt = 0
for i in range(101):
    for j in range(101):
        if arr[i][j]==1:
            for k in range(4):
                dy = i + directy[k]
                dx = j + directx[k]
                if 0<=dx<101 and 0<=dy<101 and arr[dy][dx]==0:
                    cnt+=1

print(cnt)