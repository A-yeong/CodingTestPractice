package implementation;

import java.util.Scanner;

public class knight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int row = input.charAt(1) - '0';
        int column = input.charAt(0) - 'a' + 1;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;
        for(int i = 0; i < 8; i++){
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            if(nextRow >= 1 && nextRow <= 88 && nextColumn >= 1 && nextColumn <= 8){
                result++;
            }
        }
        System.out.println(result);
    }
}
