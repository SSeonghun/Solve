arr= list(map(int,input()))

arr.sort(key=lambda x:-x)

for i in arr:
    print(i, end='')