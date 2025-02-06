"""
1. 아이디어
- N개의 숫자 정렬
- M개를 for 돌면서, 이진탐색 수행
- 이진탐색 안에서 마지막에 데이터 찾으면, 1출력, 아니면 0 출력

2. 시간복잡도
- N개 입력갑 정렬 = O(NlogN)
- M개를 N개 중에서 탐색 = O(M * logN)
- 총합: O((N+M)logN) > 약 400만개 < 2억 -> 가능

3. 자료구조
- N개 숫자: int[]
- M개 숫자: int[]
"""

import sys
input = sys.stdin.readline

N = int(input())
nums = list(map(int, input().split()))
M = int(input())
target_list = list(map(int, input().split()))

# 이진탐색은 정렬해야 가능
nums.sort()

def search(st, en, target):
    if st == en:
        if nums[st] == target:
            print(1)
        else:
            print(0)
        return
    mid = (st + en) // 2
    if(nums[mid] < target):
        search(mid + 1, en, target)
    else:
        search(st, mid, target)

for each_target in target_list:
    search(0, N - 1, each_target)