package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2776 {
    static int t, n, m;
    static int[] diary;

    static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = n - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            // 수첩의 값보다 mid의 값이 크면 왼쪽 재탐색
            if(num < arr[mid])
                end = mid - 1;
                // 수첩의 값보다 mid의 값이 작으면 오른쪽 재탐색
            else if(num > arr[mid])
                start = mid + 1;
                // 수첩의 값과 mid의 값이 같은 경우 result에 1을 저장하고 while문 break
            else
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < t; tc++) {
            n = Integer.parseInt(br.readLine());
            diary = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                diary[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(diary);
            m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                sb.append(binarySearch(diary, Integer.parseInt(st.nextToken()))).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
