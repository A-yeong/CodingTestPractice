package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1206 {
    int t = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int tc = 1; tc <= 10; tc++) {
            int height = 0;
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 2; i < n - 2; i++) {
                int[] nearArr = new int[]{arr[i - 2], arr[i - 1], arr[i + 1], arr[i + 2]};
                int max = 0;
                for (int j = 0; j < 4; j++) {
                    if(max < nearArr[j]) max = nearArr[j];
                }
                if(arr[i] > max) height += arr[i] - max;
            }
            sb.append("#").append(tc).append(" ").append(height).append("\n");
        }
        System.out.println(sb);
    }
}