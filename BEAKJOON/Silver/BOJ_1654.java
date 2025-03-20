package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1654 {
    static int k, n;
    static long result;
    static long[] lanlines;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        lanlines = new long[k];
        long start = 1, end = 0;
        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input > end)
                end = input;
            lanlines[i] = input;
        }

        while(start <= end) {
            long total = 0;
            long mid = (start + end) / 2;
            for (int i = 0; i < k; i++) {
                total += lanlines[i] / mid;
            }
            if(total >= n){
                result = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.print(result);
    }
}
