n = int(input())

arr = list(map(int, input()))

Sum = 0
for i in range(n):
    Sum += arr[i]

print(Sum)