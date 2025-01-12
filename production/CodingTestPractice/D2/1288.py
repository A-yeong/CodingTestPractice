T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    ans = 1
    cnt = 1
    arr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    while arr.count(0) > 0:
        ans = N * cnt
        for i in str(ans):
            arr[int(i)] += 1
        cnt += 1

    print("#%d" %tc, ans)