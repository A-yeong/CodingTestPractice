T = int(input())

for test_case in range(1, T + 1):
    L, U, X = map(int, input().split())
    """
    일주일에 L분 이상, U분 이하의 운동을 해야 함
    준환이는 이번 X분만큼 운동
    """

    if(X > U):
        print("#%d" %test_case, -1)
    elif(X <= L):
        print("#%d" %test_case, L - X)
    else:
        print("#%d" %test_case, 0)