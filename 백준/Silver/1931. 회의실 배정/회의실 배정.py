n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

arr.sort(key=lambda x:(x[1],x[0]))

cnt = 0
a=0
for i in range(n):
    if a <= arr[i][0]:
        cnt+=1
        a = arr[i][1]
print(cnt)