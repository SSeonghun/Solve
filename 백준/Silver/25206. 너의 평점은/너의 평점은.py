arr = []

for i in range(20):
    arr.append(input().split())

cnt = 0
for i in range(20):
    if arr[i][2]!='P':
        cnt+=float(arr[i][1])

Sum = 0
for i in range(20):
    if arr[i][2]=='A+':
        Sum += float(arr[i][1])*4.5
    elif arr[i][2]=='A0':
        Sum += float(arr[i][1])*4.0
    elif arr[i][2]=='B+':
        Sum += float(arr[i][1])*3.5
    elif arr[i][2]=='B0':
        Sum += float(arr[i][1])*3.0
    elif arr[i][2]=='C+':
        Sum += float(arr[i][1])*2.5
    elif arr[i][2]=='C0':
        Sum += float(arr[i][1])*2.0
    elif arr[i][2]=='D+':
        Sum += float(arr[i][1])*1.5
    elif arr[i][2]=='D0':
        Sum += float(arr[i][1])*1.0

print(Sum/cnt)