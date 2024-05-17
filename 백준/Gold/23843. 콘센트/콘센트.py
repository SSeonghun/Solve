n, m = map(int, input().split())
arr = list(map(int, input().split()))
lst = [0]*m
arr.sort(reverse=True)

idx = 0

for i in range(n):
    Min = 21e8
    for j in range(m):
        if Min>lst[j]:
            idx = j
            Min = lst[j]
    lst[idx]+=arr[i]

Max = max(lst)
print(Max)