T = int(input())

for tc in range(1, T + 1):
    data = [list(map(int, input().split())) for _ in range(9)]
    one_ten = list(range(1, 10))
    ans = 1

    for i in range(9):
        # 가로
        if(sorted(data[i]) != one_ten):
            ans = 0

        # 세로
        sero_arr = []
        for j in range(9):
            sero_arr.append(data[j][i])
        if(sorted(sero_arr) != one_ten):
            ans = 0

        # 3x3
        for j in range(9):
            if(i % 3 == 0 and j % 3 == 0):
                sqr_arr = []
                for k in range(3):
                    for l in range(3):
                        sqr_arr.append(data[i+k][j+l])
            if(sorted(sqr_arr) != one_ten):
                ans = 0

    print("#%d" %tc, ans)