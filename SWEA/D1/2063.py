T = int(input())
data = list(map(int, input().split()))
data = sorted(data)
print(data[T // 2])