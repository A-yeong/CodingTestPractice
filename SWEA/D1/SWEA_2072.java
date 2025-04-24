package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2072 {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < t; tc++) {
            int ans = 0;
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                int input = Integer.parseInt(st.nextToken());
                if(input % 2 != 0)
                    ans += input;
            }
            sb.append("#").append(tc + 1).append(" ").append(ans);
            System.out.println(sb);
        }
    }
}
