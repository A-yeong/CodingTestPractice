T = int(input())

for tc in range(1, T + 1):
    x, y, n = map(int, input().split())
    cnt = 0

    while(x <= n and y <= n):
        if(x > y):
            y += x
        else:
            x += y
        cnt += 1

    print(cnt)