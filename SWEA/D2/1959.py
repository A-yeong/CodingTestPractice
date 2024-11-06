T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    if N < M:
        long, short = M, N
        shortArr = list(map(int, input().split()))
        longArr = list(map(int, input().split()))
    else:
        long, short = N, M
        longArr = list(map(int, input().split()))
        shortArr = list(map(int, input().split()))
    
    ans = 0
    for i in range(long - short + 1):
        sum = 0
        for j in range(short):
            sum += longArr[i + j] * shortArr[j]
        if sum > ans:
            ans = sum

    print("#%d" %test_case, ans)

    # moreArr = []
    # lessArr = []
    # if(len(Aarr) >= len(Barr)):
    #     moreArr = Aarr
    #     lessArr = Barr
    # else:
    #     moreArr = Barr
    #     lessArr = Aarr

    # print(moreArr, lessArr)

    # max = 0
    # for i in range(len(moreArr)):
    #     sum = 0
    #     for j in range(len(lessArr)):
            