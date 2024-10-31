T = int(input())
a = []
b = 10

while T >= 10:
    a.append(T % b)
    T = T // b
a.append(T)
print(sum(a))

# T = map(int, input())
# print(sum(T))