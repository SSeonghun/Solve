s = input()
t = list(input())

n = len(t)-len(s)
flag = 0
for i in range(n):
    a = t.pop()
    if a=='B':
        t = t[::-1]
    elif a=='A':
        continue

if ''.join(t)==s:
    print(1)
else:
    print(0)