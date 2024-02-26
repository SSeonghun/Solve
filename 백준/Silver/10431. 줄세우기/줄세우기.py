p = int(input())
for P in range(1, p+1):
    arr = list(map(int, input().split()))
    lst = []

    cnt = 0
    for i in range(1, 21):
        lst.append(arr[i])
        lens = len(lst)-1
        while 1:
            if lens==0 or lst[lens-1]<lst[lens]:
                break
            if lst[lens-1] >  lst[lens]:
                lst[lens-1], lst[lens] = lst[lens], lst[lens-1]
                lens-=1
                cnt+=1

    print(f'{P} {cnt}')
