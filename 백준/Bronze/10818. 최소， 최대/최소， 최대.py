n = int(input())
arr = list(map(int, input().split()))
mn = mx = arr[0]

for i in range(n) :
    if arr[i] <mn :
        mn = arr[i]

for i in range(n) :
    if arr[i] > mx :
        mx = arr[i]

print(mn, mx)