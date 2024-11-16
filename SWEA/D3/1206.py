T = 10

for tc in range(1, T + 1):
    N = int(input())
    data = list(map(int, input().split()))
    ans = 0

    for i in range(2, N - 2):
        nearArr = [data[i - 2], data[i - 1], data[i + 1], data[i + 2]]
        if(data[i] > max(nearArr)):
            ans += data[i] - max(nearArr)

    print("#%d" %tc, ans)