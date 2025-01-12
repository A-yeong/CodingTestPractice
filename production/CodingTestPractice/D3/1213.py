T = 10

for tc in range(1, T + 1):
    t = int(input())
    search_str = input()
    input_str = input()

    print("#%d" %tc, input_str.count(search_str))