T = 10
for test_case in range(1, T + 1):
    n, input_string = input().split()
    input_string = list(input_string.strip())
    ans = []

    for i in input_string:
        if len(ans) == 0:
            ans.append(i)
        else:
            if ans[-1] == i:
                ans.pop()
            else:
                ans.append(i)

    print("#%d" %test_case, ''.join(ans))
