T = int(input())

for t in range(1, T+1):
    n, k = map(int,input().split())
    arr = []
    for i in range(n):
        arr.append(list(map(int, input().split())))
    grade = ['A+', 'A0', 'A-', 'B+', 'B0', 'B-', 'C+', 'C0', 'C-', 'D0']
    a = n//10

    lst = []
    for i in range(n):
        lst.append([arr[i][0]*35+arr[i][1]*45+arr[i][2]*20, i+1])

    lst.sort(reverse=True)

    for i in range(n):
        if lst[i][1]==k:
            b = i//a

    print(f'#{t} {grade[b]}')


