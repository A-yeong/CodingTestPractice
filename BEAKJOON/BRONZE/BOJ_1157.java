package BRONZE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        str = br.readLine();
        str = str.toUpperCase();

        int max = 0;
        int length = str.length();
        int[] chars = new int[26];
        char answer = '?';

        for (int i = 0; i < length; i++) {
            chars[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if(max < chars[i]) {
                max = chars[i];
                answer = (char)(i + 'A');
            }
            else if(max == chars[i])
                answer = '?';
        }
        sb.append(answer);
        System.out.println(sb);
    }
}
