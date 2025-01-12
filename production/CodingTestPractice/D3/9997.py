T = int(input())

for test_case in range(1, T + 1):
    theta = int(input())
    total_min = int(theta // 0.5)
    ans_hour, ans_min = 0, 0

    ans_hour = total_min // 60
    ans_min = total_min % 60

    if(ans_hour >= 12):
        ans_hour -= 12

    print("#%d" %test_case, ans_hour, ans_min)