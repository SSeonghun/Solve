n, m = map(int, input().split())
arr = []

num = 1
for i in range(n):
    arr.append(num)
    num += 1

for i in range(m):
    a, b =map(int,input().split())
    for j in range((b-a)//2+1):
        arr[a+j-1], arr[b-j-1] = arr[b-1-j], arr[a-1+j]

print(*arr)

