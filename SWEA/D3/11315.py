T = int(input())

dx = [0,0,1,1,1,-1,-1,-1]
dy = [1,-1,1,-1,0,1,-1,0]
def dfs(i, j, d, count):
    global ans
    if count >= 5:
        ans = "YES"
        return
    nx = i + dx[d]
    ny = j + dy[d]
    if nx < 0 or ny < 0 or nx >= N or ny >= N:
        return
    if omok_arr[nx][ny] == 'o':
        dfs(nx, ny, d, count + 1)
    else:
        return

for test_case in range(1, T + 1):
    N = int(input())
    omok_arr = [list(input()) for _ in range(N)]
    ans = "NO"

    for i in range(N):
        for j in range(N):
            if omok_arr[i][j] == 'o':
                for d in range(8):
                    dfs(i, j, d, 1)
            if ans == "YES":
                break

    print("#%d" %test_case, ans)