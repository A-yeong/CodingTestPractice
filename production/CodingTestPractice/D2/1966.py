T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    data = list(map(int, input().split()))
    data.sort()

    print("#%d" %tc, *data)