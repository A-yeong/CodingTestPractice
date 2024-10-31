T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    ans =[[1] for i in range(N)]
    print("#%d" %test_case)
    for i in range(N):
        if(i == 0):
            ans[i].append(1)
        elif(i == 1):
            ans[i] = [1, 2, 1]
        else:
            for j in range(1, i + 1):
                ans[i].append(ans[i- 1][j - 1] + ans[i - 1][j])
            ans[i].append(1)
                
        print(*ans[i])