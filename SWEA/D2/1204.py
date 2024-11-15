T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    data = list(map(int, input().split()))
    score_arr = [0] * 101

    for i in range(len(data)):
        score_arr[data[i]] += 1

    max_count = max(score_arr)
    ans = 0

    for i in range(100, -1, -1):
        if score_arr[i] == max_count:
            ans = i
            break

    print("#%d" %tc, ans)