package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1205 {
    static int n, score, p;
    static int[] scores;
    static int rank = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        score = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        // n이 0일 때 둘째줄 입력받지 않음
        if (n == 0)
            sb.append(1);

        // n이 0이 아닐 때 둘째줄 입력
        else {
            scores = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }

            if (n == p && score <= scores[n - 1])
                sb.append(-1);
            else {
                for (int i = 0; i < n; i++) {
                    if (scores[i] > score)
                        rank++;
                    else
                        break;
                }
                sb.append(rank);
            }
        }
        System.out.println(sb);
    }
}
