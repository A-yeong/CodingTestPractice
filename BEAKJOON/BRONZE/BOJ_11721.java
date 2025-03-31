package BRONZE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
            if(i % 10 == 9)
                sb.append("\n");
        }
        System.out.println(sb);
    }
}
