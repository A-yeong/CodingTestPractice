T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    nums = [0 for _ in range(10)]
    k = 1
    ans = 1

    while nums.count(0) > 0:
        ans = N * k
        str_n = str(ans)
        for i in str_n:
            nums[int(i)] += 1
        k += 1

    print("#%d" %test_case, ans)