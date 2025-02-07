package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_20115 {
    static int n;
    static double ans;
    static double[] drinks;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        drinks = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            drinks[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(drinks);

        for (int i = n - 1; i >= 0; i--) {
            if(i == n - 1)
                ans = drinks[i];
            else
                ans += drinks[i] / 2;
        }

        System.out.println(ans);
    }
}
