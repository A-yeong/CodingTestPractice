package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class SortingQuestion3 {
    static int n, k;
    static Integer[] arr1, arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr1 = new Integer[n];
        arr2 = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        // 첫번째 배열은 오름차순 정렬, 두번째 배열은 내림차순 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        // 두 배열 원소 K번 비교
        for (int i = 0; i < k; i++) {
            // 첫번째 배열의 원소가 두번째 배열의 원소보다 작은 경우 원소 교체
            if(arr1[i] < arr2[i])
            {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
            else break;
        }

        long result = 0;
        for(int i = 0; i < n; i++)
            result += arr1[i];
        System.out.println(result);
    }
}
