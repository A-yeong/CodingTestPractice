import java.util.*;

class PG_perfect_crime {
    public int solution(int[][] info, int n, int m) {
        int len = info.length;

        int[][] dp = new int[n][m];
        for(int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);
        dp[0][0] = 0;

        for(int i = 0; i < len; i++) {
            int aTrace = info[i][0];
            int bTrace = info[i][1];

            int[][] next = new int[n][m];
            for(int[] row : next)
                Arrays.fill(row, Integer.MAX_VALUE);

            for(int a = 0; a < n; a++) {
                for(int b = 0; b < m; b++) {
                    if(dp[a][b] == Integer.MAX_VALUE) continue;

                    // a가 훔친 경우
                    if(a + aTrace < n)
                        next[a + aTrace][b] = Math.min(next[a + aTrace][b], dp[a][b] + aTrace);

                    // b가 훔친 경우
                    if(b + bTrace < m)
                        next[a][b + bTrace] = Math.min(next[a][b + bTrace], dp[a][b]);
                }
            }

            dp = next;
        }

        int min = Integer.MAX_VALUE;
        for(int a = 0; a < n; a++) {
            for(int b = 0; b < m; b++) {
                min = Math.min(min, dp[a][b]);
            }
        }

        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}