T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())
    Aarr = list(map(int, input().split()))
    Barr = list(map(int, input().split()))

    print(Aarr, Barr)

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
            