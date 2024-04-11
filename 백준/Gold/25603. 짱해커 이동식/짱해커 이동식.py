n, m = map(int, input().split())
arr = list(map(int, input().split()))
ans = -21e8

st = 0
ed = m

while True:
    flag = 0
    min = 21e8
    for i in range(st,ed):
        if min>arr[i]:
            min=arr[i]
            st2 = i+1
            ed2 = st2+m

        if i==n-1:
            flag=1
            break
    if ed>n:
        if flag: break
    else:
        if min>ans:
            ans = min
        if flag: break

    st = st2
    ed = ed2

print(ans)