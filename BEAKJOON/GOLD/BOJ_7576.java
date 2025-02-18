package GOLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {
    static int n, m;
    static int[][] tomatos;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    private static void bfs() {
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];
            for(int i = 0; i < 4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if(nextX >= 0 && nextX< n && nextY >= 0 && nextY < m) {
                    if(tomatos[nextX][nextY] == 0) {
                        tomatos[nextX][nextY] = tomatos[nowX][nowY] + 1;
                        queue.offer(new int[]{nextX, nextY});
                    }
                }
            }
        }
    }

    private static boolean chkZero() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(tomatos[i][j] == 0)
                    return true;
            }
        }
        return false;
    }

    private static int day(int[][] map) {
        int max = Integer.MIN_VALUE;
        if(chkZero())
            return -1;
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(map[i][j] > max)
                        max = map[i][j];
                }
            }
            return max - 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        tomatos = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                tomatos[i][j] = Integer.parseInt(st.nextToken());
                if(tomatos[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        bfs();
        System.out.println(day(tomatos));
    }
}
