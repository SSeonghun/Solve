di = [0,1,0,-1]
dj = [1,0,-1,0]
T = int(input())

for x in range(T):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]

    max_v = 0   # 최대 꽃가루 합계
    for i in range(N):      # N * M 크기의 게임판
        for j in range(M):
            cnt = arr[i][j] # 터뜨린 풍선의 꽃가루 수
            # 주변 풍선의 꽃가루
            for k in range(4): # 주변 풍선의 인덱스 ni, nj
                for l in range(1, arr[i][j]+1):
                    ni = i + di[k] * l
                    nj = j + dj[k] * l
                    if 0 <= ni < N and 0 <= nj < M:
                        cnt += arr[ni][nj]
            # 꽃가루를 최댓값과 비교
            if max_v < cnt:
                max_v = cnt

    print(f'#{x+1} {max_v}')
