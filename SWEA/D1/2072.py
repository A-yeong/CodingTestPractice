import sys

T = int(input())

for test_case in range(1, T + 1):
    data = list(map(int, input().split()))
    ans = 0
    for i in range(len(data)):
        if data[i] % 2 == 1:
            ans += data[i]

    print("#%d" %test_case, ans)
