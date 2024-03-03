n = int(input())

i = 0
num = 0
while 1:
    num += i
    if num >= n:
        break
    i += 1

if i%2==0:
    print(f'{i - num + n}/{num - n + 1}')
else:
    print(f'{num - n + 1}/{i - num + n}')