import operator

T = int(input())
grade = {1 : "A+", 2 : "A0", 3 : "A-", 4 : "B+", 5 : "B0", 6 : "B-", 7 : "C+", 8 : "C0", 9 : "C-", 10 : "D0"}


for test_case in range(1, T + 1):
    N, K = map(int, input().split())
    totalArr = []
    for i in range(N):
        a, b, c = map(int, input().split())
        totalArr.append(a * 0.35 + b * 0.45 + c * 0.2)
    # print(totalArr)
    kScore = totalArr[K - 1]
    
    totalArr.sort(reverse=True)
    kGrade = totalArr.index(kScore) // (N // 10) + 1
    
    # print(totalArr)
    # print(kScore, kGrade)

    print("#%d" %test_case, grade.get(kGrade))