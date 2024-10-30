T = int(input())

for test_case in range(1, T + 1):
    x, y, n = map(int, input().split())
    cnt = 0
    while (x <= n and y <= n):
        if x < y:
            x += y
        else:
            y += x
        cnt += 1
    print(cnt)