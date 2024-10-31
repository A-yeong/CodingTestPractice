T = int(input())
days = {1: 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30, 7: 31, 8: 31, 9: 30, 10: 31, 11: 30, 12: 31}

for test_case in range(1, T + 1):
    data = str(input())
    year = data[:4]
    month = data[4:6]
    day = data[6:]
    if(0 < int(month) < 13 and 0 < int(day) <= days[int(month)]):
        print("#%d" %test_case, "%s/%s/%s" %(year, month, day))
    else:
        print("#%d" %test_case, -1)