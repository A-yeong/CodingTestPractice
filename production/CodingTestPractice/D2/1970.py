T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    a = [0, 0, 0, 0, 0, 0, 0, 0]

    while(N >= 50000):
        a[0] += 1
        N -= 50000
    while (N >= 10000):
        a[1] += 1
        N -= 10000
    while (N >= 5000):
        a[2] += 1
        N -= 5000
    while (N >= 1000):
        a[3] += 1
        N -= 1000
    while (N >= 500):
        a[4] += 1
        N -= 500
    while (N >= 100):
        a[5] += 1
        N -= 100
    while (N >= 50):
        a[6] += 1
        N -= 50
    while (N >= 10):
        a[7] += 1
        N -= 10

    print("#%d" %tc)
    print(*a)