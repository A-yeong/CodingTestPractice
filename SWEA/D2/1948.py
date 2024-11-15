T = int(input())

for test_case in range(1, T + 1):
    m1, d1, m2, d2 = map(int, input().split())
    days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    start_day = sum(days[:m1]) + d1
    end_day = sum(days[:m2]) + d2

    ans = end_day - start_day + 1

    print("#%d" %test_case, ans)