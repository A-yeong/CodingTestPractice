package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1260 {
    static int n, m, v;
    static ArrayList<Integer> graph[];
    static boolean[] isVisit;

    static void dfs(int index) {
        System.out.print(index + " ");
        isVisit[index] = true;
        for (int i : graph[index]) {
            if(!isVisit[i])
                dfs(i);
        }
    }

    static void bfs(int index) {
        isVisit[index] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        while(!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for(int i : graph[now]){
                if(!isVisit[i]){
                    queue.offer(i);
                    isVisit[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n + 1];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        isVisit = new boolean[n + 1];
        dfs(v);
        System.out.println();
        isVisit = new boolean[n + 1];
        bfs(v);

    }
}
