n = int(input())
arr = list(map(int, input().split()))
lst = sorted(set(arr))

ans = {}
for i in range(len(lst)):
    ans[lst[i]] = i

for i in arr:
    print(ans[i], end=' ')
