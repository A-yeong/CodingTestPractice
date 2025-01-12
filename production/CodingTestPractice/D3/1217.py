T = 10

def func(n, m):
    if(m == 1):
        return n
    else:
        return n * func(n, m - 1)

for test_case in range(1, T + 1):
    A = int(input())
    N, M = map(int, input().split())
    ans = func(N, M)

    print("#%d" %test_case, ans)
