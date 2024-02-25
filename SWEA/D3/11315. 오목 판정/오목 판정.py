t = int(input())

for x in range(1, t+1):
    n = int(input())
    arr = [list(input()) for _ in range(n)]

    def abc(y,x):

        directy = [1, 0, 1, 1]
        directx = [0, 1, -1, 1]

        for i in range(4):
            dy = y + directy[i]
            dx = x + directx[i]
            if 0<=dy<n and 0<=dx<n and arr[dy][dx]=='o':
                cnt = 0
                for j in range(3):
                    dy += directy[i]
                    dx += directx[i]
                    if 0<=dy<n and 0<=dx<n and arr[dy][dx]=='o':
                        cnt +=1
                    if cnt==3:
                        return 1
        return 0

    flag = 0
    for i in range(n):
        for j in range(n):
            if arr[i][j]=='o':
                ret = abc(i,j)
                if ret:
                    flag = 1

    if flag:
        print(f'#{x} YES')
    else:
        print(f'#{x} NO')