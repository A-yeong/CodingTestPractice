package GOLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_3055 {
    static int r, c;
    static int minTime = Integer.MAX_VALUE;
    static char[][] arr;
    static boolean[][] isVisit;
    static boolean canReach;
    static int sx, sy, ex, ey;

    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new char[r][c];
        isVisit = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = line.charAt(j);
                if(arr[i][j] == 'S'){
                    sx = i;
                    sy = j;
                }
                else if(arr[i][j] == 'D') {
                    ex = i;
                    ey = j;
                }
            }
        }

        dfs(sx, sy, 0);
        System.out.println(minTime == Integer.MAX_VALUE ? "KAKTUS" : minTime);
    }

    static void dfs(int x, int y, int time){
        if(x == ex && y == ey){
            minTime = Math.min(minTime, time);
            return;
        }

        isVisit[x][y] = true;
        char[][] tempArr = copyArray(arr);
        spreadWater();

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx >= 0 && nx < r && ny >= 0 && ny < c){
                if(!isVisit[nx][ny] && (arr[nx][ny] == '.' || arr[nx][ny] == 'D'))
                    dfs(nx, ny, time + 1);
            }
        }

        arr = tempArr;
        isVisit[x][y] = false;
    }

    static void spreadWater() {
        List<int[]> waterList = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j] == '*')
                    waterList.add(new int[]{i, j});
            }
        }

        for (int[] water: waterList){
            int x = water[0];
            int y = water[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx >= 0 && nx < r && ny >= 0 && ny < c && arr[nx][ny] == '.')
                    arr[nx][ny] = '*';
            }
        }
    }

    static char[][] copyArray(char[][] original) {
        char[][] copy = new char[r][c];
        for (int i = 0; i < r; i++) {
            copy[i] = Arrays.copyOf(original[i], c);
        }
        return copy;
    }
}
