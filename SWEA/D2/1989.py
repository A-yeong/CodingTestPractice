T = int(input())

for test_case in range(1, T + 1):
    text = str(input())
    reversText = text[::-1]

    if(text == reversText):
        print("#%d" %test_case, 1)
    else:
        print("#%d" %test_case, 0)