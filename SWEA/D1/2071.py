cnt = int(input())

for test_case in range(cnt):
    data = list(map(int, input().split()))

    print("#%d" %test_case, round(sum(data)/10))
