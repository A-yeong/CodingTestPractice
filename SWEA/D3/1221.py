T = int(input())

another_num = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]

for test_case in range(1, T + 1):
    a, n = input().split()
    nums = list(map(str, input().split()))
    ans = []

    for i in another_num:
        for j in range(int(n)):
            if nums[j] == i:
                ans.append(nums[j])

    print("#%d" %test_case)
    print(*ans)