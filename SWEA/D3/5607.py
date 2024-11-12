T = int(input())

for test_case in range(1, T + 1):
    N, R = map(int, input().split())
    n, r = 1, 1

    for i in range(R):
        n *= N - i
        r *= R - i

    print("#%d" %test_case, (n // r) % 1234567891)