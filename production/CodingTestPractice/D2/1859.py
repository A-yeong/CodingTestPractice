T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    data = list(map(int, input().split()))
    current_max = data[N - 1]
    ans = 0

    for i in range(N - 1, -1, -1):
        if(current_max <= data[i]):
            current_max = data[i]
        else:
            ans += current_max - data[i]
    print("#%d" %tc, ans)
