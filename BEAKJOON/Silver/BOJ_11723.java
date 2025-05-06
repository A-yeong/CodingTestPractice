package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_11723 {
    static int m, input;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(!str.equals("all") && !str.equals("empty"))
                input = Integer.parseInt(st.nextToken());

            if(str.equals("add")){
                if(!list.contains(input))
                    list.add(input);
            } else if (str.equals("remove")) {
                if(list.contains(input))
                    list.remove((Integer)input);
            } else if (str.equals("check")) {
                if(list.contains(input))
                    sb.append("1\n");
                else
                    sb.append("0\n");
            } else if (str.equals("toggle")) {
                if(list.contains(input))
                    list.remove((Integer)input);
                else
                    list.add(input);
            } else if (str.equals("all")) {
                list.clear();
                for (int j = 1; j <= 20; j++) {
                    list.add(j);
                }
            } else if (str.equals("empty")) {
                list.clear();
            }
        }
        System.out.println(sb);
    }
}
