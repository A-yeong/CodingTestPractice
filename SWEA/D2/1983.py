T = int(input())

for tc in range(1, T + 1):
    N, K = map(int, input().split())
    grade_arr = ['D0', 'C-', 'C0', 'C+', 'B-', 'B0', 'B+', 'A-', 'A0', 'A+']
    data = []

    for i in range(N):
        a, b, c = map(int, input().split())
        person = a * 0.35 + b * 0.45 + c * 0.20
        data.append(person)

    k_score = data[K - 1]
    data.sort()
    div = N // 10
    k_grade = data.index(k_score) // div

    print("#%d" %tc, grade_arr[k_grade])