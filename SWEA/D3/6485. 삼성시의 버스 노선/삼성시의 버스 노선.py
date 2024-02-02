t = int(input())
for x in range(t):
    n = int(input())
    arr = [0]*5001

    for i in range(n):
        a, b = map(int, input().split())
        for j in range(a,b+1):
            arr[j] += 1
    p = int(input())
    busstop = [int(input()) for i in range(p)]

    print(f'#{x + 1}', end=' ')
    for i in busstop:
        print(arr[i], end=' ')
    print()