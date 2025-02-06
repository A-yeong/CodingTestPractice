package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_1758 {
    static int n;
    static long ans;
    static long[] tips;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tips = new long[n];
        for (int i = 0; i < n; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }

        Long[] longTips = Arrays.stream(tips).boxed().toArray(Long[]::new);
        Arrays.sort(longTips, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            long tip = longTips[i] - i;
            if(tip > 0)
                ans += tip;
        }

        System.out.println(ans);
    }
}
