st = input()
num = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

cnt = 0

for i in range(len(st)):
    for j in range(8):
        if st[i] in num[j]:
            cnt += 3
            cnt += j

print(cnt)