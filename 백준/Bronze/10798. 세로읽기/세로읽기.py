arr = [list(input()) for _ in range(5)]

for i in range(15):
    for j in range(5):
        try:
            print(arr[j][i],end='')
        except:
            continue