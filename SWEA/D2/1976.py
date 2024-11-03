T = int(input())

for test_case in range(1, T + 1):
    arr = list(map(int, input().split()))
    hour = arr[0] + arr[2]
    min = arr[1] + arr[3]
    if(hour >= 12):
        hour %= 12
    if(min >= 60):
        min %= 60
        hour += 1
    print("#%d %d %d" %(test_case, hour, min))