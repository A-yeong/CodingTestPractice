T = int(input())

for tc in range(1, T + 1):
    data = [list(map(int, input().split())) for _ in range(9)]
    one_ten = list(range(1, 10))
    chk = 1

    for i in range(9):
        if(chk == 0):
            break

        # 가로
        if(sorted(data[i]) != one_ten):
            chk = 0

        # 세로
        yarr = []
        for j in range(9):
            yarr.append(data[j][i])
        if(sorted(yarr) != one_ten):
            chk = 0

        # 3x3
        for j in range(9):
            if(i % 3 == 0 and j % 3 == 0):
                sqrarr = []
                for k in range(3):
                    for l in range(3):
                        sqrarr.append(data[i + k][j + l])
                if(sorted(sqrarr) != one_ten):
                    chk = 0

    print("#%d" %tc, chk)