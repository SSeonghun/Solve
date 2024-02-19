st = input().upper()
bucket = [0]*100

for i in st:
    bucket[ord(i)]+=1

Max = -1
ret = []

for i in range(100):
    if bucket[i]>Max:
        Max = bucket[i]

for i in range(100):
    if bucket[i] == Max:
        ret.append(chr(i))

if len(ret) >= 2:
    print('?')

else: print(ret[0])




