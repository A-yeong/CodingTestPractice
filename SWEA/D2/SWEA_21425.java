package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_21425 {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int cnt = 0;
            while(x <= n && y <= n) {
                if(x < y)
                    x += y;
                else
                    y += x;
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
