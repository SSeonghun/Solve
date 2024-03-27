n, m = map(int, input().split())

arr = []
for i in range(n):
    arr.append(input())

cnt = 0
for i in range(m):
    a = input()
    cnt+=arr.count(a)

print(cnt)