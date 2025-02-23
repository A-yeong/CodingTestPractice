package GOLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2573 {
    static int n, m, count, years;
    static int max = Integer.MIN_VALUE;
    static int[][] ices;
    static boolean[][] isVisited;
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ices = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                ices[i][j] = Integer.parseInt(st.nextToken());
                if(ices[i][j] > max)
                    max = ices[i][j];
            }
        }


        while(true) {
            count = iceCount();
            if(count >= 2) break;
            if(count == 0) {
                years = 0;
                break;
            }
            melt();
            years++;
        }

        System.out.println(years);
    }

    static void dfs(int x, int y) {
        isVisited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                if(ices[nx][ny] > 0 && !isVisited[nx][ny])
                    dfs(nx, ny);
            }
        }

    }

    static void melt() {
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(ices[i][j] > 0) {
                    int waterCnt = 0;
                    for(int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        if(nx >= 0 && nx < n && ny >=0 && ny < m && ices[nx][ny] == 0)
                            waterCnt++;
                    }
                    temp[i][j] = Math.max(0, ices[i][j] - waterCnt);
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.arraycopy(temp[i], 0, ices[i], 0, m);
        }
    }

    static int iceCount() {
        isVisited = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(ices[i][j] > 0 && !isVisited[i][j]){
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
