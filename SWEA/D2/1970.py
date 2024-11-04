T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    moneyArr = [0, 0, 0, 0, 0, 0, 0, 0]

    while(N >= 50000):
            N -= 50000
            moneyArr[0] += 1
    while(N >= 10000):
            N -= 10000
            moneyArr[1] += 1
    while(N >= 5000):
            N -= 5000
            moneyArr[2] += 1
    while(N >= 1000):
            N -= 1000
            moneyArr[3] += 1
    while(N >= 500):
            N -= 500
            moneyArr[4] += 1
    while(N >= 100):
            N -= 100
            moneyArr[5] += 1
    while(N >= 50):
            N -= 50
            moneyArr[6] += 1
    while(N >= 10):
            N -= 10
            moneyArr[7] += 1

    print("#%d" %test_case, *moneyArr)