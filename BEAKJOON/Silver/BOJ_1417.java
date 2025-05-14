package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_1417 {
    static int n, dasom;
    static int ans = 0;
    static Integer[] another;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        dasom = Integer.parseInt(br.readLine());

        if(n > 1) {
            // 다솜이 빼고 다른 후보들 투표수 배열에 저장
            another = new Integer[n - 1];
            for (int i = 0; i < n - 1; i++) {
                another[i] = Integer.parseInt(br.readLine());
            }
            while(true) {
                // 다른 후보 투표수 내림차순으로 정렬
                Arrays.sort(another, Collections.reverseOrder());
                // 다솜이 득표수가 가장 많을 때 while문 종료
                if(dasom > another[0])
                    break;
                // 가장 많은 후보자 매수
                another[0]--;
                dasom++;
                ans++;
            }
            sb.append(ans);
        }
        // 단일후보인 경우 0 출력
        else{
            sb.append(0);
        }
        System.out.println(sb);
    }
}
