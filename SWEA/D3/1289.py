T = int(input())

for test_case in range(1, T + 1):
    ans_input = list(map(int, input()))
    bit_arr = [0 for _ in range(len(ans_input))]
    cnt = 0

    for i in range(len(ans_input)):
        if(ans_input[i] != bit_arr[i]):
            bit_arr[i:] = [ans_input[i]] * len(bit_arr[i:])
            cnt += 1
    print("#%d" %test_case, cnt)