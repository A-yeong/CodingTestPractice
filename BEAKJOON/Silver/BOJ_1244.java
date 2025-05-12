package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1244 {
    static int s;
    static int[] switches;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        s = Integer.parseInt(br.readLine());
        switches = new int[s];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < s; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int switchNum = Integer.parseInt(st.nextToken()) - 1;

            // 남자
            if(gender == 1) {
                for (int j = switchNum; j < s; j += (switchNum + 1)) {
                    switches[j] = (switches[j] == 0)? 1 : 0;
                }
            }

            // 여자
            else if(gender == 2) {
                switches[switchNum] = (switches[switchNum] == 0) ? 1 : 0;
                int left = switchNum - 1;
                int right = switchNum + 1;
                while(left >= 0 && right < s && switches[left] == switches[right]) {
                    switches[left] = (switches[left] == 0) ? 1: 0;
                    switches[right] = (switches[right] == 0) ? 1: 0;
                    left--;
                    right++;
                }
            }
        }
        for (int i = 0; i < s; i++) {
            sb.append(switches[i]).append(" ");
            if((i + 1) % 20 == 0) sb.append("\n");
        }
        System.out.println(sb);
    }
}
