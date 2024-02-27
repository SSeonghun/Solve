arr1 = [list(map(int, input().split())) for _ in range(5)]
arr2 = [list(map(int, input().split())) for _ in range(5)]

def bingo(a):
    cnt = 0

    for i in range(5):
        for j in range(5):
            if arr1[i][j]==a:
                arr1[i][j]=0

    for i in range(5):
        lst = []
        for j in range(5):
            if arr1[i][j]==0:
                lst.append(arr1[i][j])
        if lst.count(0) == 5:
            cnt += 1

    for i in range(5):
        lst = []
        for j in range(5):
            if arr1[j][i]==0:
                lst.append(arr1[j][i])
        if lst.count(0) == 5:
            cnt += 1

    lst = []
    for i in range(5):
        if arr1[i][i]==0:
                lst.append(arr1[i][i])
        if lst.count(0) == 5:
            cnt += 1

    x = 4
    lst = []
    for i in range(5):
        if arr1[i][i+x]==0:
            lst.append(arr1[i][i+x])
        if lst.count(0) == 5:
            cnt += 1
        x-=2
    return cnt

num = 0
flag = 0
for i in range(5):
    for j in range(5):
        ret = bingo(arr2[i][j])
        num+=1
        if ret>=3:
            print(num)
            flag = 1
        if flag==1:
            break
    if flag==1:
        break