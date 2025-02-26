package GOLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1987 {
    static int r, c;
    static char[][] map;
    static boolean[] isVisit = new boolean[26];
    static int cnt = 1;

    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        dfs(0, 0, 1);
        System.out.println(cnt);
    }

    private static void dfs(int x, int y, int count) {
        char currentAlphabet = map[x][y];
        int idx = currentAlphabet - 'A';
        if(isVisit[idx]){
            return;
        }
        isVisit[idx] = true;
        cnt = Math.max(cnt, count);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < r && ny < c) {
                dfs(nx, ny, count + 1);
            }
        }
        isVisit[idx] = false;
    }
}
