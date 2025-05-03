package BRONZE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2816 {
    static String[] channels;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        channels = new String[n];
        for (int i = 0; i < n; i++) {
            channels[i] = br.readLine();
        }

        // KBS1 찾기
        int index = 0;
        while(!channels[index].equals("KBS1")) {
            index++;
            sb.append("1");
        }

        // KBS1 위로 올리기
        while(index > 0) {
            swap(index, index - 1);
            index--;
            sb.append("4");
        }

        // KBS2 찾기
        while(!channels[index].equals("KBS2")) {
            index++;
            sb.append("1");
        }

        while(index > 1) {
            index--;
            sb.append("4");
        }

        System.out.println(sb);
    }

    private static void swap(int a, int b) {
        String temp = channels[a];
        channels[a] = channels[b];
        channels[b] = temp;
    }
}
