T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    ans = []

    for n in range(N):
        C, K = map(str, input().split())
        for i in range(int(K)):
            ans.append(C)

    print("#%d" %test_case)
    for i in range(len(ans)//10 + 1):
        print("".join(ans[i * 10 : (i + 1) * 10]))