T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    rotate_90 = list(map(list, zip(*arr[::-1])))
    rotate_180 = list(map(list, zip(*rotate_90[::-1])))
    rotate_270 = list(map(list, zip(*rotate_180[::-1])))

    print("#%d" %test_case)
    for i in range(N):
        print("".join(map(str, rotate_90[i])), end = " ")
        print("".join(map(str, rotate_180[i])), end = " ")
        print("".join(map(str, rotate_270[i])))
            