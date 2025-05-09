package GOLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15989 {
    static int t, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        int MAX = 10000;

        int[][] dp = new int[MAX + 1][4];

        dp[0][0] = 1;

        for (int tc = 0; tc < t; tc++) {
            n = Integer.parseInt(br.readLine());
            dp[1][1] = dp[2][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;
            for (int i = 4; i <= n; i++) {
                dp[i][1] = dp[i - 1][1];
                dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
                dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i -3][3];
            }
            sb.append(dp[n][3] + dp[n][2] + dp[n][1] + "\n");
        }
        System.out.println(sb);
    }
}
