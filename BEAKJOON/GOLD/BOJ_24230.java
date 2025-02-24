package GOLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_24230 {
    static int n;
    static List<Integer>[] tree;
    static int[] colors;
    static boolean[] visit;
    static int paintCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new List[n + 1];
        colors = new int[n + 1];
        visit = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            colors[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            tree[u].add(v);
            tree[v].add(u);
        }

        if(n == 1) {
            System.out.println(colors[1] == 0? 0 : 1);
            return;
        }

        dfs(1, 0);

        System.out.println(paintCount);
    }

    static void dfs(int node, int parentColor) {
        visit[node] = true;
        if(colors[node] != parentColor){
            paintCount++;
        }
        for(int next: tree[node]){
            if(!visit[next])
                dfs(next, colors[node]);
        }
    }
}
