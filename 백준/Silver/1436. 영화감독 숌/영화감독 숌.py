n = int(input())

cnt = 0
result = 666

while 1:
    if '666' in str(result):
        cnt+=1

    if cnt==n:
        break

    result +=1

print(result)