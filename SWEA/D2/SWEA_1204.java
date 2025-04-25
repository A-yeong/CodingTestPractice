package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] scores = new int[101];

            int ans = 0;
            int maxCnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                scores[score]++;
            }
            for (int i = 0; i <= 100; i++) {
                if(scores[i] >= maxCnt)
                {
                    maxCnt = scores[i];
                    ans = i;
                }
            }
            sb.append("#").append(n).append(" ").append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
