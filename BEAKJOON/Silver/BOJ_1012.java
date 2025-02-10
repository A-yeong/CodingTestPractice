package Silver;

/*
1. 아이디어
- bfs 이용
- M * N 배열 생성 후, 배추가 심어져있는 인덱스에 1 저장
- 2중 for문 돌기 -> 값이 1, 방문하지 않았다면 bfs
- bfs 돌면서 배추흰지렁이 마리 수 계산

2. 자료구조
- int[][] map : 배추 밭
- bool[][] isVisit : 방문 체크

3. 시간복잡도
- BFS : O(V + E)
- V = M * N
- E = V * 4
- O(V + E) = O(5V)
- m 최대 50, n 최대 50
- 최악의 경우 5V = 125000 < 2억 -> 충분히 가능

4. 공간복잡도
- map : O(m * n)
- isVisit : O(m * n)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012 {
    static LinkedList<Integer> ans = new LinkedList<>();
    static int t, m, n, k;
    static int[][] map;
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static boolean[][] isVisit;

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        isVisit[x][y] = true;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                for(int j = 0; j < 4; j++){
                    if(nextX >= 0 && nextX < m && nextY >= 0 && nextY < n) {
                        if(map[nextX][nextY] == 1 && !isVisit[nextX][nextY]){
                            queue.offer(new int[]{nextX,nextY});
                            isVisit[nextX][nextY] = true;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        t = Integer.parseInt(br.readLine());
        for(int h = 0; h < t; h++){

            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map = new int[m][n];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            isVisit = new boolean[m][n];
            int wormCnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1 && isVisit[i][j] == false){
                        bfs(i, j);
                        wormCnt++;
                    }
                }
            }
            ans.add(wormCnt);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans.poll());
        }
    }
}
