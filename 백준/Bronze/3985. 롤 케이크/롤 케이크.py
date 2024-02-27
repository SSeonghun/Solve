l = int(input())
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

Max1 = 0
for i in range(n):
    if Max1<arr[i][1]-arr[i][0]+1:
        Max1 = arr[i][1]-arr[i][0]+1
        num = i+1

used = [0]*(l+1)

Max2 = 0
for i in range(n):
    num1 = 0
    for j in range(arr[i][0], arr[i][1]+1):
        if used[j]==0:
            num1+=1
            used[j]=1
        if Max2<num1:
            Max2 = num1
            numm = i+1

print(num)
print(numm)
