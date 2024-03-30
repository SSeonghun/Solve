n, m = map(int, input().split())
dic = {}
dic2 = {}
for i in range(1,n+1):
    a = input()
    dic[str(i)] = a
    dic2[a] = str(i)


for i in range(m):
    a = input()
    if a.isdigit():
        print(dic[a])
    else:
        print(dic2[a])