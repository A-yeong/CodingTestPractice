T = int(input())

for tc in range(1, T + 1):
    data = list(map(int, input().split()))
    data.sort()
    data_sum = sum(data) - min(data) - max(data)
    ans = round(data_sum / (len(data) - 2))

    print("#%d" %tc, ans)