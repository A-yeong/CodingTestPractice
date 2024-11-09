for test_case in range(1, 11):
    N = int(input())
    arr = [list(map(int, input().split())) for i in range(100)]
    sum = []
    for i in range(100):
        garoSum = 0
        seroSum = 0
        for j in range(100):
            garoSum += arr[i][j]
            seroSum += arr[j][i]
        sum.append(garoSum)
        sum.append(seroSum)
    
    crossSum = 0
    for i in range(100):
        crossSum += arr[i][i]
    sum.append(crossSum)

    crossSum = 0
    for i in range(100):
        for j in range(100):
            if(i + j == 99):
                crossSum += arr[i][j]
    sum.append(crossSum)

    print("#%d" %N, max(sum))