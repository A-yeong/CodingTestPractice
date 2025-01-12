data = list(map(str, input()))

for i in range(len(data)):
    ans = ord(data[i]) - 64
    print(ans, end = " ")