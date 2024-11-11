T = int(input())

for test_case in range(1, T + 1):
    N, M, K = map(int, input().split())
    time = list(map(int, input().split()))
    time.sort()
    result = "Possible"

    for i in range(N):
        bread = (time[i] // M) * K
        if bread < i + 1:
            result = "Impossible"
    print("#%d" %test_case, result)