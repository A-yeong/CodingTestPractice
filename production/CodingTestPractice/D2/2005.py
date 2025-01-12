T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    arr = [[] for _ in range(N)]

    for i in range(N):
        if i == 0:
            arr[i].append(1)
        elif i == 1:
            arr[i].append(1)
            arr[i].append(1)
        else:
            arr[i].append(1)
            for j in range(1, i):
                arr[i].append(arr[i - 1][j - 1] + arr[i - 1][j])
            arr[i].append(1)

    print("#%d" %tc)
    for i in range(N):
        print(*arr[i])