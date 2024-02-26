t = int(input())

for T in range(1, t+1):
    n = int(input())

    i = 1
    arr = [0]*10
    while 1:
        a = str(n*i)
        for j in range(len(a)):
            arr[int(a[j])]=1
        flag = 1
        for x in range(10):
            if arr[x]==1:
                continue
            else: flag = 0
        if flag:
            print(f'#{T} {a}')
            break
        i+=1