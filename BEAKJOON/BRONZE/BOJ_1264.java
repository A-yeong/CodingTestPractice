package BRONZE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class BOJ_1264 {
    public static void main(String[] args) throws IOException {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true) {
            int result = 0;
            input = br.readLine();
            if(input.equals("#"))
                break;
            for(char ch : input.toCharArray()){
                if(vowels.contains(ch))
                    result++;
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
