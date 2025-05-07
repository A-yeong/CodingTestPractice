package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_25757 {
    static int t, ans, size;
    static String game;
    static Set<String> players = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken());
        game = st.nextToken();

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            players.add(input);
        }

        size = players.size();

        if(game.equals("Y"))
            ans = size;
        else if (game.equals("F"))
            ans = size / 2;
        else if (game.equals("O"))
            ans = size / 3;

        sb.append(ans);
        System.out.println(ans);
    }
}
