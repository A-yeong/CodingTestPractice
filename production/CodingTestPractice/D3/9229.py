T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    snack_list = list(map(int, input().split()))
    max_weight = -1

    for i in range(N):
        for j in range(i + 1, N):
            sum_weight = snack_list[i] + snack_list[j]
            if(max_weight < sum_weight <= M):
                max_weight = sum_weight

    print("#%d" %test_case, max_weight)
