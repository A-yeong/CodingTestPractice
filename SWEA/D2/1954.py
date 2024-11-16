T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    data = [[0 for _ in range(N)] for _ in range(N)]

    dy = [0, 1, 0, -1]
    dx = [1, 0, -1, 0]

    def snail(x, y, d, num):
        data[y][x] = num
        nx = x + dx[d]
        ny = y + dy[d]
        if num == N * N:
            return
        if nx < 0 or ny < 0 or nx >= N or ny >= N or data[ny][nx] != 0:
            d = (d + 1) % 4
            snail(x, y, d, num)
        else:
            snail(nx, ny, d, num + 1)

    snail(0, 0, 0, 1)
    print("#%d" %tc)
    for i in range(N):
        print(*data[i])