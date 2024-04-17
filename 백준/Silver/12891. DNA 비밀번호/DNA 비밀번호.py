s, p = map(int ,input().split())
st = input()
a, c, g, t = map(int, input().split())
cnt = 0

dic = {'A': a, 'C': c, 'G': g, 'T': t}
for i in range(0, p):
    dic[st[i]] -= 1

start = 0
end = p
while 1:
    flag = 0
    for i in dic.values():
        if i>0:
            flag=1
            break
    if flag==0:
        cnt+=1
    if end==s:
        break
    dic[st[start]]+=1
    dic[st[end]] -= 1
    start+=1
    end+=1

print(cnt)