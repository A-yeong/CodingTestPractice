T = int(input())

for test_case in range(1, T + 1):
    P, Q, R, S, W = map(int, input().split())
    less_pay = 0
    A = P * W
    B = Q
    if(W > R):
        B += S * (W - R)
    if(A >= B):
        less_pay = B
    else:
        less_pay = A

    print("#%d" %test_case, less_pay)