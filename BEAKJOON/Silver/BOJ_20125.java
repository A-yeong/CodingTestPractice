package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20125 {
    static int n;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int heartX = 0, heartY = 0;

        // 심장 찾기
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '*') {
                    if(i + 1 < n && arr[i + 1][j] == '*') {
                        heartX = i + 1;
                        heartY = j;
                        break outer;
                    }
                }

            }
        }

        int leftArm = 0, rightArm = 0, waist = 0, leftLeg = 0, rightLeg = 0;

        // 왼팔
        for (int j = heartY - 1; j >= 0 ; j--) {
            if(arr[heartX][j] == '*') leftArm++;
            else break;
        }

        // 오른팔
        for (int j = heartY + 1; j < n; j++) {
            if(arr[heartX][j] == '*') rightArm++;
            else break;
        }

        // 허리
        int waistEndX = heartX;
        for (int i = heartX + 1; i < n; i++) {
            if(arr[i][heartY] == '*') {
                waist++;
                waistEndX = i;
            }
            else break;
        }

        // 왼다리
        for (int i = waistEndX + 1; i < n; i++) {
            if(arr[i][heartY - 1] == '*') leftLeg++;
            else break;
        }

        // 오른다리
        for (int i = waistEndX + 1; i < n; i++) {
            if(arr[i][heartY + 1] == '*') rightLeg++;
            else break;
        }

        sb.append(heartX + 1).append(" ").append(heartY + 1).append("\n");
        sb.append(leftArm).append(" ").append(rightArm).append(" ").append(waist).append(" ").append(leftLeg).append(" ").append(rightLeg);
        System.out.println(sb);
    }
}
