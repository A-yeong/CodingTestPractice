package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815 {
    static int n, m;
    static int[] arr;

    static int binarySearch(int[] arr, int input) {
        int start = 0;
        int end = n - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(input > arr[mid])
                start = mid + 1;
            else if(input < arr[mid])
                end = mid - 1;
            else
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr, input)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
