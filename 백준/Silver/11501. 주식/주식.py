T = int(int(input()))

for _ in range(T):
    n = int(input())
    arr = list(map(int, input().split()))
    arr.reverse()

    sum = 0

    temp = arr[0]
    for i in range(1, len(arr)):
        if temp >= arr[i]:
            sum += temp - arr[i]
        else:
            temp = arr[i]

    print(sum)