n, m = map(int, input().split())
arra = []
arrb = []

for i in range(n):
    arra.append(list(map(int, input().split())))
for i in range(n):
    arrb.append(list(map(int, input().split())))

for i in range(n):
    for j in range(m):
        arra[i][j]+=arrb[i][j]

for i in range(n):
    for j in range(m):
        print(arra[i][j],end=' ')
    print()