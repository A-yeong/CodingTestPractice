T = int(input())

for tc in range(1, T + 1):
    h1, m1, h2, m2 = map(int, input().split())

    hour = (h1 + h2 + (m1 + m2) // 60) % 12
    if hour == 0:
        hour = 12
    minute = (m1 + m2) % 60

    print("#%d" %tc, hour, minute)