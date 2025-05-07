package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10431 {
    static int p, t, ans;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        p = Integer.parseInt(br.readLine());
        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t = Integer.parseInt(st.nextToken());
            arr = new int[20];
            ans = 0;

            for (int j = 0; j < 20; j++) {
                int input = Integer.parseInt(st.nextToken());
                int pos = j;

                // 삽입 위치 찾기
                for (int k = 0; k < j; k++) {
                    if(input < arr[k]) {
                        pos = k;
                        break;
                    }
                }

                // 밀기
                for (int k = j; k > pos; k--) {
                    arr[k] = arr[k - 1];
                    ans++;
                }

                arr[pos] = input;
            }
            sb.append(t).append(" ").append(ans).append("\n");

        }
        System.out.println(sb);


    }
}
