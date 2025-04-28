package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1984 {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int sum = 0;
            for (int i = 1; i < 9; i++) {
                sum += arr[i];
            }
            sb.append("#").append(tc).append(" ").append(Math.round((float) sum / 8)).append("\n");
        }
        System.out.println(sb);
    }
}
