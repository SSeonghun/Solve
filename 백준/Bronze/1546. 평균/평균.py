N = int(input())
arr = list(map(int, input().split()))

Max = 0
for i in range(N):
    if Max < arr[i] :
        Max = arr[i]

for i in range(N):
    arr[i] = arr[i]/Max*100

newSum = 0
for i in range(N):
    newSum += arr[i]
newavg = newSum/N


print(newavg)