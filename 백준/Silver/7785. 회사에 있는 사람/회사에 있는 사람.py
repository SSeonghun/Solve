n = int(input())
dic = {}

for i in range(n):
    a, b = input().split()
    if b == 'enter':
        dic[a] = b
    else:
        del dic[a]

dic = sorted(dic.keys(), reverse=True)

for i in dic:
    print(i)

