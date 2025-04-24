package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2071 {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 0;
            for (int i = 0; i < 10; i++) {
                int input = Integer.parseInt(st.nextToken());
                ans += input;
            }
            ans = Math.round((float) ans /10);
            sb.append("#").append(tc).append(" ").append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
