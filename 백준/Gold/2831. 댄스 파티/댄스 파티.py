n = int(input())
man = list(map(int, input().split()))
woman = list(map(int, input().split()))
man_plus, man_minus, woman_plus, woman_minus = [], [], [], []

for i in man:
    if i>0:
        man_plus.append(i)
    else:
        man_minus.append(abs(i))

for i in woman:
    if i>0:
        woman_plus.append(i)
    else:
        woman_minus.append(abs(i))

man_plus.sort(reverse=True)
man_minus.sort(reverse=True)
woman_plus.sort(reverse=True)
woman_minus.sort(reverse=True)

cnt = 0

m, w = 0, 0
while m<len(man_plus) and w<len(woman_minus):
    man = man_plus[m]
    woman = woman_minus[w]
    if man<woman:
        cnt+=1
        m+=1
        w+=1
    else:
        m+=1


m, w = 0, 0
while m<len(man_minus) and w<len(woman_plus):
    man = man_minus[m]
    woman = woman_plus[w]
    if woman<man:
        cnt+=1
        m+=1
        w+=1
    else:
        w+=1


print(cnt)