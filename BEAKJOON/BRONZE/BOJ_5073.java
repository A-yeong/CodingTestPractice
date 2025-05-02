package BRONZE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_5073 {
    static int[] triangle = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true)
        {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                triangle[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(triangle);

            if(triangle[2] == 0) break;

            if(triangle[2] >= triangle[0] + triangle[1])
                sb.append("Invalid\n");
            else if(triangle[0] == triangle[1] && triangle[1] == triangle[2])
                sb.append("Equilateral\n");
            else if(triangle[0] == triangle[1] || triangle[1] == triangle[2] || triangle[0] == triangle[2])
                sb.append("Isosceles\n");
            else
                sb.append("Scalene\n");
        }
        System.out.println(sb);
    }
}
