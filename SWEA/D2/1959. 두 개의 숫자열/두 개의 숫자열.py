t = int(input())

for x in range(1, t+1):
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    def abc(i):
        global Sum
        Sum = 0
        if n<m:
            for j in range(n):
                Sum += a[j]*b[i+j]
        else :
            for j in range(m):
                Sum += a[i+j]*b[j]

        return Sum

    Max = -21e8
    for i in range(abs(m-n)+1):
        ret = abc(i)
        if Max < ret:
            Max = ret

    print(f'#{x} {Max}')