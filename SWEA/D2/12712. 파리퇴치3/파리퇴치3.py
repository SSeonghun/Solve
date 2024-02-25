t = int(input())

for x in range(1, t+1):
    n, m = map(int, input().split())
    arr = []
    for i in range(n):
        arr.append(list(map(int, input().split())))

    def getsum(y,x):
        global Sum
        Sum = arr[y][x]
        directy = [-1, 1, 0, 0]
        directx = [0, 0, -1, 1]

        for i in range(4):
            for j in range(1,m):
                dy = y + directy[i]*j
                dx = x + directx[i]*j
                if 0<=dy<n and 0<=dx<n:
                    Sum += arr[dy][dx]

        return Sum


    def getsum2(y, x):
        global Sum2
        Sum2 = arr[y][x]
        directy = [-1, -1, 1, 1]
        directx = [-1, 1, -1, 1]

        for i in range(4):
            for j in range(1,m):
                dy = y + directy[i] * j
                dx = x + directx[i] * j
                if 0 <= dy < n and 0 <= dx < n:
                    Sum2 += arr[dy][dx]

        return Sum2

    Max = -21e8
    for i in range(n):
        for j in range(n):
            ret1 = getsum(i,j)
            ret2 = getsum2(i,j)
            if Max<ret1:
                Max = ret1
            if Max < ret2:
                Max = ret2

    print(f'#{x} {Max}')