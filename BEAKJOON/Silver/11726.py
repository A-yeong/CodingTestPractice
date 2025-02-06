"""
1. 아이디어
- 점화식: An = An- 1 + An - 2
- N값 구하기 위해, for문 3부터 N까지의 값을 구해주기
- 이전값, 이전이전값 더해서 10007로 나누어 저장

2. 시간복잡도
- O(N)

3. 자료구조
- DP 값 저장하는 (경우의 수) 배열 : int[]
    : 최댓값이 10007보다 작아서 int 가능
"""

import sys
input = sys.stdin.readline

N = int(input())
result = [0, 1, 2]

for i in range(3, N + 1):
    result.append((result[i - 2] + result[i - 1])%10007)

print(result[N])