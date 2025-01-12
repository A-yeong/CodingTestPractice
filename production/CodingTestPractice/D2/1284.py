T = int(input())

for test_case in range(1, T + 1):
    P, Q, R, S, W = map(int, input().split())

    A = P * W
    B = Q
    if(W > R):
        B += (W - R) * S
    less = min(A, B)
    print("#%d" %test_case, less)