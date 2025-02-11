package Silver;

/*
1. 아이디어
- BFS 사용
- 최솟값~최댓값 for문 돌면서 안전영역 개수 array에 저장

2. 자료구조
- int[][] map : 지역 저장
- boolean[][] isVisit : 방문 여부 저장

3. 시간복잡도
- BFS 시간복잡도 V + E
- V : 최대 100
- E : 4 * V 최대 400
- 최소 1부터 100까지 for문 돌아 탐색해야 함
- 최악의 경우 = 100 * 400 * 100 = 4000000(4백만) < 2억

4. 공간복잡도
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2468 {
    static int n;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[][] map;
    static boolean[][] isVisit;
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static int ans = 1;

    static void bfs(int x, int y, int height) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        isVisit[x][y] = true;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                for (int j = 0; j < 4; j++) {
                    if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
                        if(map[nextX][nextY] > height && isVisit[nextX][nextY] == false) {
                            queue.offer(new int[]{nextX, nextY});
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
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int input = Integer.parseInt(st.nextToken());
                map[i][j] = input;
                if(input > max) max = input;
                if(input < min) min = input;
            }
        }

        for(int h = min; h < max; h++) {
            int area = 0;
            isVisit = new boolean[n][n];
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(map[i][j] > h && isVisit[i][j] == false) {
                        bfs(i, j, h);
                        area++;
                    }
                }
            }
            if(area > ans) ans = area;
        }

        System.out.println(ans);
    }
}
