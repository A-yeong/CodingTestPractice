T = int(input())

for test_case in range(1, T + 1):
    data = list(map(int, input().split()))

    print("#%d" %test_case, round(sum(data)/10))
