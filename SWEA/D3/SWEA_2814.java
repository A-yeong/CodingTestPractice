package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class SWEA_2814 {
	static int t, m, n, max;
	static List<Integer>[] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			// 인접 리스트 초기화
			graph = new ArrayList[n + 1];
			for(int i = 1; i <= n; i++) {
				graph[i] = new ArrayList<>();
			}
			
			// 간선 정보 입력
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				graph[x].add(y);
				graph[y].add(x);
			}
			
			max = 0;
			visited = new boolean[n + 1];
			
			for(int i = 1; i <= n; i++) {
				Arrays.fill(visited, false);
				dfs(i, 1);
			}
			
			sb.append("#").append(tc).append(" ").append(max).append("\n");
		}
		System.out.println(sb);
	}
	
	private static void dfs(int node, int length) {
		visited[node] = true;
		max = Math.max(max, length);
		
		for(int next : graph[node]) {
			if(!visited[next])
				dfs(next, length + 1);
		}
		
		visited[node] = false;
	}
}