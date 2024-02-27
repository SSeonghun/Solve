garo, sero = map(int, input().split())
n = int(input())

arr1 = [0]
arr2 = [0]
for i in range(n):
    a, b= map(int,input().split())
    if a==1:
        arr1.append(b)
    else:
        arr2.append(b)
arr1.append(garo)
arr2.append(sero)
arr1.sort()
arr2.sort()

max_g=0
for i in range(len(arr1)-1):
    g = arr1[i+1]-arr1[i]
    if max_g<g:
        max_g = g
max_s=0
for i in range(len(arr2)-1):

    s = arr2[i+1]-arr2[i]
    if max_s<s:
        max_s = s

print(max_g*max_s)