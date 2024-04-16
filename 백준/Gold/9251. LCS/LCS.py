st1 = input()
st2 = input()

n = len(st1)
m = len(st2)

arr = [[0]*(m+1) for _ in range(n+1)]

for i in range(1, n+1):
    for j in range(1, m+1):
        if st1[i-1] == st2[j-1]:
            arr[i][j] = arr[i-1][j-1]+1
        else:
            arr[i][j] = max(arr[i-1][j], arr[i][j-1])

print(arr[n][m])