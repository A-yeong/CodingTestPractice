package implementation;

import java.util.Scanner;

public class lrud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");

        int x = 1, y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] moveTypes = {"L", "R", "U", "D"};

        for(int i = 0; i < plans.length; i++){
            int nx = -1, ny = -1;
            for(int j = 0; j < 4; j++){
                if(plans[i].equals(moveTypes[j])){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
