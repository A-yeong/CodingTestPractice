T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    ans = ""

    for i in range(N):
        letter, num = input().split()
        ans += letter * int(num)

    print("#%d" %tc)
    for i in range(len(ans) // 10 + 1):
        print(ans[i * 10:(i + 1) * 10])