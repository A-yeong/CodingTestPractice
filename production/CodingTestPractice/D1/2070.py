T = int(input())

for test_case in range(1, T + 1):
    data = list(map(int, input().split()))
    ans = ''
    if(data[0] > data[1]):
        ans = '>'
    elif(data[0] < data[1]):
        ans = '<'
    else:
        ans = '='

    print("#%d" %test_case, ans)