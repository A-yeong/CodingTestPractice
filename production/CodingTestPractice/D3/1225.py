"""
1. 아이디어
- for문 5번 돌면서 0번 인덱스에 i값 빼고 결과를 list에 append, 0번 값은 popleft
- 마지막 인덱스 값이 0 이하가 될 때까지 반복

2. 자료구조
- 8개의 데이터 입력값: int[]
"""

import sys
input = sys.stdin.readline

for test_case in range(10):
    n = int(input())
    data = list(map(int, input().split()))

    while(data[len(data) - 1] > 0):
        for i in range(1, 6):
            if(data[len(data) - 1]):
                if(data[0] - i < 0):
                    data.append(0)
                else:
                    data.append(data[0] - i)
                data.pop(0)
            
    print("#%d" %n, *data)
    