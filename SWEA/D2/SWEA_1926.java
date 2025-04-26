package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1926 {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int cnt = 0;
            while(temp > 0) {
                if(temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9) {
                    cnt++;
                }
                temp /= 10;
            }
            if(cnt == 0)
                sb.append(i);
            else{
                for (int j = 0; j < cnt; j++) {
                    sb.append("-");
                }
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
