package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_6485 {
	static int t, n;
	static int[] stops;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			stops = new int[5001];
			
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				for(int j = a; j <= b; j++) {
					stops[j]++;
				}
			}
			
			int p = Integer.parseInt(br.readLine());
			sb.append("#").append(tc).append(" ");
			for(int i = 0; i < p; i++) {
				int c = Integer.parseInt(br.readLine());
				sb.append(stops[c]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
