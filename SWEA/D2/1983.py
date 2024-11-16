T = int(input())

for tc in range(1, T + 1):
    N, K = map(int, input().split())
    grades_arr = ['D0', 'C-', 'C0', 'C+', 'B-', 'B0', 'B+', 'A-', 'A0', 'A+']
    student_score = []

    for n in range(N):
        a, b, c = map(int, input().split())
        person = a * 0.35 + b * 0.45 + c * 0.20
        student_score.append(person)

    k_grade = student_score[K - 1]
    student_score.sort()
    div = N // 10
    k_final = student_score.index(k_grade) // div

    print("#%d" %tc, grades_arr[k_final])
