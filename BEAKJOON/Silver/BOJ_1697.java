package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
    static int n, k;
    static int[] visit = new int[100001];

    static void bfs(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visit[n] = 1;
        while(!queue.isEmpty()) {
            int now = queue.poll();
            for(int i = 0; i < 3; i++){
                int next;
                if(i == 0)
                    next = now + 1;
                else if (i == 1)
                    next = now - 1;
                else
                    next = now * 2;

                if(next == k) {
                    System.out.println(visit[now]);
                    return;
                }

                if(next > 0 & next < visit.length && visit[next] == 0){
                    queue.offer(next);
                    visit[next] = visit[now] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        if(n == k){
            System.out.println(0);
        }
        else {
            bfs(n);
        }
    }
}
