n, b = input().split()
ret = 0
n = n[::-1]
for i in range(len(n)):
    if 65<=ord(n[i])<=95:
        ret += (ord(n[i]) - 55) * (int(b) ** i)
    else:
        ret += int(n[i])*int(b)**i

print(ret)