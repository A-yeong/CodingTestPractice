T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    arr = list(map(int, input().split()))
    scores = [0] * 101

    for i in range(len(arr)):
        scores[arr[i]] += 1

    max_count = max(scores)
    ans = scores.index(max(scores))
    for i in range(100, -1, -1):
        if(scores[i] == max_count):
            ans = i
            break

    print("#%d" %test_case, ans)