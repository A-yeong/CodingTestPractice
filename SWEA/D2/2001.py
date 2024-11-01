T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    flies = []

    for i in range(N - M + 1):
        for j in range(N - M + 1):
            sum = 0
            for k in range(M):
                for l in range(M):
                    sum += arr[i + k][j + l]
            flies.append(sum)

    print("#%d" %test_case, max(flies))
    # print(max)
        