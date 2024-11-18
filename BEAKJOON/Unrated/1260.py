from collections import deque


def dfs(n):
    print(n, end=' ')
    visited[n] = True
    for i in graph[n]:
        if not visited[i]:
            dfs(i)

def bfs(n):
    visited[n] = True
    queue = deque([n])

    while queue:
        q = queue.popleft()
        print(q, end=' ')
        for i in graph[q]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)

N, M, V = map(int, input().split())

graph = [[] for _ in range(N + 1)]
for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(N + 1):
    graph[i].sort()

visited = [False] * (N + 1)
dfs(V)
print()
visited = [False] * (N + 1)
bfs(V)