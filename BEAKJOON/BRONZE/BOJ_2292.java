package BRONZE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 1;
        while (n > range) {
            range += 6 * cnt;
            cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);

    }
}
