T = int(input())

for test_case in range(1, T + 1):
    cnt = int(input())
    data = list(map(int, input().split()))
    currentMax = data[cnt - 1]
    ans = 0
    for j in range(cnt - 1, -1, -1):
        if(currentMax <= data[j]):
            currentMax = data[j]
        else:
            ans += currentMax - data[j]
    print("#%d" %test_case, ans)