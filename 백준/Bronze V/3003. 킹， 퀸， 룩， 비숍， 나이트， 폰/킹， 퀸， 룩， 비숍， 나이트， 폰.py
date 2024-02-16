arr = list(map(int, input().split()))
name = [1, 1, 2, 2, 2, 8]

for i in range(6):
    print(name[i]-arr[i], end=' ')
