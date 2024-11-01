T = int(input())

for test_case in range(1, T + 1):
    data = list(map(int, input().split()))
    data.sort()
    avr = round((sum(data) - min(data) - max(data)) / (len(data) - 2))
    print("#%d" %test_case, avr)