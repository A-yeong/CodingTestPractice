T = 10

for test_case in range(1, T + 1):
    n = int(input())
    search_str = input()
    input_str = input()
    cnt = 0

    for i in range(0, len(input_str) - len(search_str) + 1):
        if(input_str[i:i+len(search_str)] == search_str):
            cnt += 1
    print("#%d" %test_case, cnt)