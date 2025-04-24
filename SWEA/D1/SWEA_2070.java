package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2070 {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            if(first > second)
                sb.append("#").append(tc).append(" >\n");
            else if (first < second)
                sb.append("#").append(tc).append(" <\n");
            else
                sb.append("#").append(tc).append(" =\n");
        }
        System.out.println(sb);
    }
}
