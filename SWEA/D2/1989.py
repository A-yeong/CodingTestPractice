T = int(input())

for tc in range(1, T + 1):
    data = input()
    reverse_data = data[::-1]

    if data == reverse_data:
        print("#%d" %tc, 1)
    else:
        print("#%d" %tc, 0)