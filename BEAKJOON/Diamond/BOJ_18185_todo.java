package Diamond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18185_todo {
    static int n;
    static int money = 0;
    static int[] counts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()) + 2;
        counts = new int[n];

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 2; i++) {
            counts[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - 2; i++) {
            if(counts[i + 1] > counts[i + 2]){
                five(i, Math.min(counts[i], counts[i + 1] - counts[i + 2]));
                seven(i, Math.min(counts[i], Math.min(counts[i + 1], counts[i + 2])));
                three(i, counts[i]);
            }else {
                seven(i, Math.min(counts[i], Math.min(counts[i + 1], counts[i + 2])));
                five(i, Math.min(counts[i], counts[i + 1] - counts[i + 2]));
                three(i, counts[i]);
            }
        }

        System.out.println(money);
    }

    static void seven(int idx, int min){
        counts[idx] -= min;
        counts[idx + 1] -= min;
        counts[idx + 2] -= min;
        money += min * 7;
    }

    static void five(int idx, int min){
        counts[idx] -= min;
        counts[idx + 1] -= min;
        money += min * 5;
    }

    static void three(int idx, int min){
        counts[idx] -= min;
        money += min * 3;
    }
}
