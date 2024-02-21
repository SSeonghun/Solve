n = int(input())

cnt = n
for i in range(n):
    st = input()
    for j in range(len(st)-1):
        if st[j] == st[j+1]:
            continue
        elif st[j] in st[j+1:]:
            cnt-=1
            break
print(cnt)