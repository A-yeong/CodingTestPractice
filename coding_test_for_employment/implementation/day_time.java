package implementation;

import java.util.Scanner;

public class day_time {

    public static boolean check(int h, int m, int s){
        if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i <= h; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 60; k++){
                    if(check(i, j, k)) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
