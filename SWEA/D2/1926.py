N = int(input())

for i in range(1, N + 1):
    if '3' in str(i) or '6' in str(i) or '9' in str(i):
        cnt = str(i).count('3') + str(i).count('6') + str(i).count('9')
        print('-' * cnt, end=" ")
        # print(" ", end="")
    else:
        print(i, end=" ")