T = int(input())

for tc in range(1, T + 1):
    N, M = map(int, input().split())
    short_arr, long_arr = [], []

    if(N > M):
        long_arr = list(map(int, input().split()))
        short_arr = list(map(int, input().split()))
    else:
        short_arr = list(map(int, input().split()))
        long_arr = list(map(int, input().split()))

    ans = 0
    for i in range(len(long_arr) - len(short_arr) + 1):
        sum = 0
        for j in range(len(short_arr)):
            sum += long_arr[i + j] * short_arr[j]
        if sum > ans:
            ans = sum

    print("#%d" %tc, ans)