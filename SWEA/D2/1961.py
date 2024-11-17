T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    data = [list(map(int, input().split())) for _ in range(N)]
    rotate_90 = list(map(list, zip(*data[::-1])))
    rotate_180 = list(map(list, zip(*rotate_90[::-1])))
    rotate_270 = list(map(list, zip(*rotate_180[::-1])))

    print("#%d" %tc)
    for i in range(N):
        print("".join(map(str, rotate_90[i])), end = " ")
        print("".join(map(str, rotate_180[i])), end=" ")
        print("".join(map(str, rotate_270[i])))