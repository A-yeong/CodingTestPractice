package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5789 {
	static int t, n, q, l, r;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());
			
			arr = new int[n + 1];
			for(int a = 1; a <= q; a++) {
				st = new StringTokenizer(br.readLine());
				l = Integer.parseInt(st.nextToken());
				r = Integer.parseInt(st.nextToken());
				for(int i = l; i <= r; i++) {
					arr[i] = a;
				}
			}
			
			sb.append("#").append(tc).append(" ");
			for(int i = 1; i <= n; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
