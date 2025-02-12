package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10451 {
    static int[] arr;
    static boolean[] isVisit;
    static int n;

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        isVisit[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            int next = arr[now];
            if(!isVisit[next]) {
                isVisit[next] = true;
                bfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t --> 0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            isVisit = new boolean[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int circleCnt = 0;
            for (int i = 1; i <= n; i++) {
                if(!isVisit[i]) {
                    bfs(i);
                    circleCnt++;
                }
            }
            System.out.println(circleCnt);
        }
    }
}
