k = int(input())
arr = []
for i in range(k):
    n = int(input())
    if n != 0:
        arr.append(n)
    else:
        arr.pop()

print(sum(arr))
