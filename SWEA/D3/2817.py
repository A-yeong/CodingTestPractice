T = int(input())

def dfs(i, result):
    global cnt
    if result == K:
        cnt += 1
        return
    if i == N:
        return
    dfs(i + 1, result + number[i])
    dfs(i + 1, result)

for test_case in range(1, T + 1):
    N, K = map(int, input().split())
    number = list(map(int, input().split()))
    cnt = 0
    dfs(0,0)

    print("#%d" %test_case, cnt)