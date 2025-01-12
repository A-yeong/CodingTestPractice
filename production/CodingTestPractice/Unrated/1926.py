"""
1 찾기 -> BFS
2중 for문, 1 나올 때마다 BFS
2중 for문에서는 값이 1, 방문하지 않은 곳만 BFS
1을 발견하면 그림 개수 ++, 최댓값 찾기

1. 아이디어
- 2중 for문 => 값이 1 && 방문 x => BFS
- BFS 돌면서 그림 개수 + 1, 최대값 갱신

2. 시간복잡도
- BFS : O(V + E)
- V : m * n
- E : V * 4
- O(V + E) = O(5V) = O(5*m*n)
- m, n은 최대 500, 따라서 5 * 25000 = 100만 < 2억(1초에 연산 가능한 개수)

3. 자료구조
- 그래프 전체 지도: int[][]
- 방문 여부: bool[][]
- Queue(BFS)
"""

import sys
input = sys.stdin.readline

n, m = map(int, input().split())
map = [list(map(int, input().split())) for _ in range(n)]
chk = [[False] * m for _ in range(n)]

"""
- 0, 1 -> 오른쪽
- 1, 0 -> 밑
- 0, -1 -> 왼쪽
- -1, 0 -> 위쪽
"""
dy = [0, 1, 0, -1]
dx = [1, 0, -1, 0]
def bfs(y, x):
    rs = 1
    # q에 값을 넣음
    q = [(y, x)]
    # q에 새로 들어가지 않을 때까지 while문 반복
    while q:
        # 각각 q를 뽑음
        ey, ex = q.pop()
        # 동서남북 네 방향으로 옮겨주면서 새로운 1이 있는지 확인
        for k in range(4):
            ny = ey + dy[k]
            nx = ex + dx[k]
            # 전체 지도 넘어가지 않는지 확인
            if 0 <= ny < n and 0<=nx<m:
                # 그래프 값이 1이고, 방문하지 않은 경우
                if map[ny][nx] == 1 and chk[ny][nx] == False:
                    # 그림 사이즈 늘림
                    rs += 1
                    # check는 True로 변경
                    chk[ny][nx] = True
                    # queue에 새로운 값 추가
                    q. append((ny, nx))
    return rs

cnt = 0
maxv = 0
for j in range(n):
    for i in range(m):
        if map[j][i] == 1 and chk[j][i] == False:
            chk[j][i] = True
            # 전체 그림 개수 + 1
            cnt += 1
            # BFS -> 그림의 크기 구해줌
            maxv = max(maxv, bfs(j, i))
            # 최대값 갱신

print(cnt)
print(maxv)