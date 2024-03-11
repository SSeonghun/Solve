n = int(input())

Min = 21e8
i = 0
j = 21e8
ans = 21e8
while 1:
    N=n
    N-=5*i
    if N%3==0:
        j = N//3
        ans = i+j
    if Min>ans:
        Min = ans
    i+=1
    if n<5*i:
        break
if Min==21e8:
    print(-1)
else:
    print(Min)