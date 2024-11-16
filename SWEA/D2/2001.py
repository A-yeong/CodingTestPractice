T = int(input())

for tc in range(1, T + 1):
    N, M = map(int, input().split())
    data = [list(map(int, input().split())) for _ in range(N)]
    areas = []

    for i in range(N - M + 1):
        for j in range(N - M + 1):
            area = 0
            for k in range(M):
                for l in range(M):
                    area += data[i + k][j + l]
            areas.append(area)

    print("#%d" %tc, max(areas))