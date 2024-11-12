for test_case in range(1, 11):
    N = 8
    p = int(input())
    arr = [input() for _ in range(N)]
    cnt = 0

    for i in range(N):
        for j in range(N - p + 1):
            if arr[i][j:j+p] == arr[i][j:j + p][::-1]:
                cnt += 1

    for j in range(N):
        for i in range(N - p + 1):
            c = ''
            for ci in range(i, i + p):
                c += arr[ci][j]
            if c == c[::-1]:
                cnt += 1

    print("#%d" %test_case, cnt)
