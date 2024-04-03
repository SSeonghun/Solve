n = int(input())
arr = list(map(int, input().split()))
x = int(input())
cnt = 0
arr.sort()
st, ed = 0, len(arr)-1
while st<ed:
    if arr[st] + arr[ed] > x:
        ed-=1
    elif arr[st] + arr[ed]< x:
        st +=1
    else:
        cnt+=1
        ed-=1
        st+=1
print(cnt)