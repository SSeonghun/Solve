n, m = map(int, input().split())
arr = [list(input()) for _ in range(n)]

def abc(y,x):
    cnt = 0
    for i in range(8):
        if i % 2 == 0:
            for j in range(0,8,2):
                if arr[y][x]!=arr[y+i][x+j]:
                    cnt+=1
            for j in range(1,8,2):
                if arr[y][x]==arr[y+i][x+j]:
                    cnt+=1
        else:
            for j in range(0, 8, 2):
                if arr[y][x] == arr[y+i][x+j]:
                    cnt += 1
            for j in range(1, 8, 2):
                if arr[y][x] != arr[y+i][x+j]:
                    cnt += 1
    return cnt

def ab(y,x):
    cnt = 0
    for i in range(8):
        if i % 2 == 0:
            for j in range(0,8,2):
                if arr[y][x]==arr[y+i][x+j]:
                    cnt+=1
            for j in range(1,8,2):
                if arr[y][x]!=arr[y+i][x+j]:
                    cnt+=1
        else:
            for j in range(0, 8, 2):
                if arr[y][x] != arr[y+i][x+j]:
                    cnt += 1
            for j in range(1, 8, 2):
                if arr[y][x] == arr[y+i][x+j]:
                    cnt += 1
    return cnt

Min = 65
for i in range(n-8+1):
    for j in range(m-8+1):
        ret1 = abc(i,j)
        ret2 = ab(i,j)
        if Min>ret1:
            Min = ret1
        if Min>ret2:
            Min = ret2
print(Min)