package greedy;

import java.util.Scanner;

public class card_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] minList = new int[n];
        for(int i = 0; i < n; i++){
            int min = 10001;
            for(int j = 0; j < m; j++){
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
            minList[i] = min;
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            if(minList[i] > max)
                max = minList[i];
        }

        System.out.println(max);
    }
}
