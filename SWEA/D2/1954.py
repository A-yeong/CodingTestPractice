T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    arr = [[ 0 for _ in range(N)] for _ in range(N)]
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]

    def snail( x, y, d, num):
        arr[x][y] = num
        nx = x + dx[d]
        ny = y + dy[d]
        if num == N * N:
            return
        if nx < 0 or ny < 0 or nx >= N or ny >= N or arr[nx][ny] != 0:
            d = (d + 1) % 4
            snail(x, y, d, num)
        else:
            snail(nx, ny, d, num + 1)

    snail(0, 0, 0, 1)
    print("#%d" %test_case)
    for i in range(N):
        print(*arr[i])