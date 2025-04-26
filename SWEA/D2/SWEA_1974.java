package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1974 {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            boolean garo = true;
            boolean sero = true;
            boolean square = true;
            int[][] arr = new int[9][9];

            // 배열 입력
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로 확인
            for (int i = 0; i < 9; i++) {
                int garoSum = 0;
                for (int j = 0; j < 9; j++) {
                    garoSum += arr[i][j];
                }
                if (garoSum != 45) {
                    garo = false;
                    break;
                }
            }

            // 세로 확인
            for (int i = 0; i < 9; i++) {
                int seroSum = 0;
                for (int j = 0; j < 9; j++) {
                    seroSum += arr[j][i];
                }
                if (seroSum != 45) {
                    sero = false;
                    break;
                }
            }

            // 사각형 확인
            for (int i = 0; i < 9; i++) {
                if (i % 3 == 0){
                    int squareSum = 0;
                    for (int j = i; j < i + 3; j++) {
                        for (int k = i; k < i + 3; k++) {
                            squareSum += arr[j][k];
                        }
                    }
                    if(squareSum != 45){
                        square = false;
                        break;
                    }
                }
            }

            // boolean 확인
            if(garo && sero && square)
                sb.append("#").append(tc).append(" ").append(1).append("\n");
            else
                sb.append("#").append(tc).append(" ").append(0).append("\n");
        }
        System.out.println(sb);
    }
}
