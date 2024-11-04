T = int(input())

for test_case in range(1, T + 1):
    arr = [list(map(int, input().split())) for i in range(9)]
    oneToTen = list(range(1, 10))
    check = True

    for i in range(9):
        if(check == False):
            break

        # 가로 비교
        if(sorted(arr[i]) != oneToTen):
            check = False

        # 세로 비교
        yarr=[]
        for j in range(9):
            yarr.append(arr[j][i])
        if(sorted(yarr) != oneToTen):
            check = False
        
        # 3x3 비교
        for j in range(9):
            if(i % 3 == 0 and j % 3 == 0):
                sqrarr = []
                for k in range(3):
                    for l in range(3):
                        sqrarr.append(arr[i + k][j + l])
                if(sorted(sqrarr) != oneToTen):
                    check = False
                        
        # print(sorted(sqarr), check)
    
    if(check == False):
        print("#%d" %test_case, 0)
    else:
        print("#%d" %test_case, 1)