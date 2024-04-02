N = int(input())
# a의 b 제곱값의 1의 자리 수의 패턴 저장
array = [[0], [1], [2, 4, 8, 6], [3, 9, 7, 1], [4, 6, 4, 6], [5], [6], [7, 9, 3, 1], [8, 4, 2, 6], [9, 1, 9, 1]]

for _ in range(N):
    # a, b값 입력 받음
    a, b = map(int, input().split())
    # a가 10의 배수일 경우, 10 출력
    if a % 10 == 0:
        print(10)
        continue
    # a % 10이 1, 5, 6일 경우, a % 10 값 출력
    elif a % 10 == 1 or a % 10 == 5 or a % 10 == 6:
        print(a % 10)
        continue
    # b가 0이면 1 출력
    if b == 0:
        print(1)
    # b % 4가 0이면, array에 저장해둔 패턴값 가져옴
    elif b % 4 == 0:
        print(array[a % 10][3])
    else:
        print(array[a % 10][b % 4 - 1])