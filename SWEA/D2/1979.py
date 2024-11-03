T = int(input())

for test_case in range(1, T + 1):
    N, K = map(int, input().split())
    arr = [list(map(int, input().split())) for i in range(N)]
    blank = []
    
    for i in range(N):
        cnt = 0
        for j in range(N - 1):
            if(arr[i][j] == 1 and arr[i][j - 1] == 1):
                cnt += 1
        blank.append(cnt)
    print(blank)