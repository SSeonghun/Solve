n, m = map(int, input().split())
arr = []
for i in range(n):
    arr.append(i+1)

for x in range(m) :
    i, j = map(int, input().split())
    c = arr[i-1]
    arr[i-1] = arr[j-1]
    arr[j-1] = c


print(*arr)