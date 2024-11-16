T = int(input())

for tc in range(1, T + 1):
    N, K = map(int, input().split())
    data = [list(map(int, input().split())) for _ in range(N)]
    result = 0

    # 가로
    for i in range(N):
        cnt = 0
        for j in range(N):
            if data[i][j] == 1:
                cnt += 1
            if data[i][j] == 0 or j == N - 1:
                if cnt == K:
                    result += 1
                cnt = 0

        # 세로
        for j in range(N):
            if data[j][i] == 1:
                cnt += 1
            if data[j][i] == 0 or j == N - 1:
                if cnt == K:
                    result += 1
                cnt = 0

    print("#%d" %tc, result)