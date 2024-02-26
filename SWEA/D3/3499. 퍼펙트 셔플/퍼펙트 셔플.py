t = int(input())

for T in range(1, t+1):
    n = int(input())
    arr = list(input().split())

    mid = n//2
    lst = []

    print(f'#{T}', end=' ')

    if n%2==0:
        for i in range(mid):
            lst.append(arr[i])
            lst.append(arr[mid+i])

        print(*lst)
    else:
        for i in range(mid+1):
            lst.append(arr[i])
            if i + mid + 1 >= n: continue
            lst.append(arr[i+mid+1])

        print(*lst)
