for test_case in range(1, 11):
    N = int(input())
    ans = 0
    arr = list(map(int, input(). split()))
    for i in range(2, len(arr) - 2):
        nearArr = [arr[i - 2], arr[i - 1], arr[i + 1], arr[i + 2]]
        if(arr[i] > max(nearArr)):
            ans += arr[i] - max(nearArr)
    print("#%d" %test_case, ans)