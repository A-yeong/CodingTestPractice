package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2806 {
    static int t, n, count;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            n = Integer.parseInt(br.readLine());
            count = 0;
            arr = new int[n];
            solve(0);
            sb.append("#").append(tc).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }

    static void solve(int row) {
        if(row == n){
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[row] = i;
            if(isPossible(row))
                solve(row + 1);
        }
    }

    static boolean isPossible(int row) {
        for (int i = 0; i < row; i++) {
            if(arr[i] == arr[row]) return false;
            if(Math.abs(row - i) == Math.abs(arr[row] - arr[i])) return false;
        }
        return true;
    }
}
