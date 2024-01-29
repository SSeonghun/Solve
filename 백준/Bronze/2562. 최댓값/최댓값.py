arr = []

for i in range(9) :
    arr.append(int(input()))

mx = arr[0]

for i in range(9) :
    if arr[i] > mx :
        mx = arr[i]

for i in range(9) :
    if arr[i] == mx :
        break
print(mx)
print(i+1)