T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    data = list(map(int, input().split()))

    print("#%d" %test_case, *sorted(data))