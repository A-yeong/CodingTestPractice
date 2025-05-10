package GOLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_13549 {
    static int n, k;
    static int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] time = new int[MAX + 1];
        boolean[] visited = new boolean[MAX + 1];

        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(n);
        visited[n] = true;

        while(!queue.isEmpty()) {
            int current = queue.poll();

            if(current == k) {
                sb.append(time[current]);
                System.out.println(sb);
                return;
            }

            if(current * 2 <= MAX && !visited[current * 2]) {
                visited[current * 2] = true;
                time[current * 2] = time[current];
                queue.addFirst(current * 2);
            }
            if(current - 1 >= 0 && !visited[current - 1]) {
                visited[current - 1] = true;
                time[current - 1] = time[current] + 1;
                queue.addLast(current - 1);
            }
            if(current + 1 <= MAX && !visited[current + 1]) {
                visited[current + 1] = true;
                time[current + 1] = time[current] + 1;
                queue.addLast(current + 1);
            }


        }

    }
}
