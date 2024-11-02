import operator

T = int(input())
totalArr ={}

for test_case in range(1, T + 1):
    N, K = map(int, input().split())
    totalArr = {}
    for i in range(1, N + 1):
        a, b, c = map(int, input().split())
        totalArr[i] = a * 0.35 + b * 0.45 + c * 0.2
    totalArr = sorted(totalArr.items(), key=operator.itemgetter(1), reverse=True)
    print("---")
    print(totalArr)