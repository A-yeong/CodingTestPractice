T = int(input())

for test_case in range(1, T + 1):
    data = list(map(int, input().split()))
    data = sorted(data)
    idx = T // 2

    print(data[idx])