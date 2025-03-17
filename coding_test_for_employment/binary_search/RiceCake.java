package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RiceCake {
    static int n, m, result;
    static int start = 0;
    static int end = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int l = Integer.parseInt(st.nextToken());
            if(end < l)
                end = l;
            arr[i] = l;
        }

        // 이진탐색 수행
        while(start <= end) {
            int total = 0;
            int mid = (start + end) / 2;
            for(int x : arr){
                // 잘랐을 때 떡의 양 계산
                if(x > mid)
                    total += x - mid;
            }
            // 떡의 양이 부족한 경우 더 많이 자름(왼쪽 탐색)
            if (total < m)
                end = mid - 1;
            // 떡의 양이 충분한 경우 덜 자름(오른쪽 탐색)
            else {
                result = mid; // 최대한 덜 잘랐을 때가 정답 -> 여기에서 result 기록
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
