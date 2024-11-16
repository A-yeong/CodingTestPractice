T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    triangle = [[] for _ in range(N)]

    for i in range(N):
        if i == 0:
            triangle[i].append(1)
        elif i == 1:
            triangle[i].append(1)
            triangle[i].append(1)
        else:
            triangle[i].append(1)
            for j in range(1, i):
                triangle[i].append(triangle[i-1][j-1] + triangle[i-1][j])
            triangle[i].append(1)

    print("#%d" %tc)
    for i in range(N):
        print(*triangle[i])