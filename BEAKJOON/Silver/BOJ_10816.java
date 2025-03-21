package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10816 {
    static int n, m;
    static int[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int search = Integer.parseInt(st.nextToken());
            int result = upperBound(search) - lowerBound(search);
            sb.append(result).append(" ");
        }

        System.out.println(sb.toString());
    }

    static int upperBound(int target) {
        int start = 0, end = n;
        while (start < end) {
            int mid = (start + end) / 2;
            if(cards[mid] > target) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    static int lowerBound(int target) {
        int start = 0, end = n;
        while(start < end) {
            int mid = (start + end) / 2;
            if(cards[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}
