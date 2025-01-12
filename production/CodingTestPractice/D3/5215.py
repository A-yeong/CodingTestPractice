import sys
input = sys.stdin.readline

T = int(input())

def select_burger(burger_list, cal_limit):
    n = len(burger_list)
    dp = [[0 for _ in range(cal_limit + 1)] for _ in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, cal_limit + 1):
            score, cal = burger_list[i - 1]
            if cal <= j:
                dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - cal] + score)
            else:
                dp[i][j] = dp[i - 1][j]
    return dp[n][cal_limit]

for test_cast in range(1, T + 1):
    N, L = map(int, input().split())
    list = []
    for i in range(N):
        score, kcal = map(int, input().split())
        list.append((score, kcal))
    res = select_burger(list, L)
    print("#%d" %test_cast, res)