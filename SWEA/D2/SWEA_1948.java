package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1948 {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        // 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int ans = 0;
            if(m1 == m2)
                ans = d2 - d1 + 1;
            else{
                for (int i = m1; i < m2; i++) {
                    ans += days[i];
                }
                ans += d2 - d1 + 1;
            }
            sb.append("#").append(tc).append(" ").append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
