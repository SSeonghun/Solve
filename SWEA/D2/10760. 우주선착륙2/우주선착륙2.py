t = int(input())

for x in range(1, t+1):
    n, m = map(int, input().split())
    arr = []
    for i in range(n):
        arr.append(list(map(int, input().split())))

    directy = [-1, 1, 0, 0, -1, -1, 1, 1]
    directx = [0, 0, -1, 1, -1, 1, -1, 1]

    def abc(y,x):
        global cnt
        cnt = 0
        for i in range(8):
            dy = y + directy[i]
            dx = x + directx[i]
            if 0<=dy<n and 0<=dx<m:
                if arr[dy][dx]<arr[y][x]:
                    cnt += 1

        if cnt>=4:
            return 1
        else:
            return 0

    Sum = 0
    for i in range(n):
        for j in range(m):
            Sum+=abc(i,j)

    print(f'#{x} {Sum}')