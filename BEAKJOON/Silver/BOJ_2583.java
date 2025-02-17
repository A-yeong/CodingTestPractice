package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2583 {
    static int m, n, k, x1, y1, x2, y2;
    static int[][] map;
    static boolean[][] isVisit;
    static List<Integer> areas = new ArrayList<>();
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    static void bfs(int x, int y, List<Integer> areas) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        isVisit[x][y] = true;
        int size = 1;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                for(int j = 0; j < 4; j++) {
                    if(nextX >= 0 && nextX < m && nextY >= 0 && nextY < n) {
                        if(map[nextX][nextY] == 0 && !isVisit[nextX][nextY]) {
                            queue.offer(new int[]{nextX, nextY});
                            isVisit[nextX][nextY] = true;
                            size++;
                        }
                    }
                }
            }
        }
        areas.add(size);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[m][n];
        isVisit = new boolean[m][n];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            for (int j = y1; j < y2; j++) {
                for (int l = x1; l < x2; l++) {
                    map[j][l] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 0 && !isVisit[i][j]){
                    bfs(i, j, areas);
                }
            }
        }

        Collections.sort(areas);
        System.out.println(areas.size());
        for(int area: areas)
            System.out.print(area + " ");
    }
}
