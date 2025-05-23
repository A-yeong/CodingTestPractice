package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3282 {
	static int t, n, k;
	static int[] vArr;
	static int[] cArr;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			vArr = new int[n];
			cArr = new int[n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				vArr[i] = Integer.parseInt(st.nextToken());
				cArr[i] = Integer.parseInt(st.nextToken());
			}
			
			dp = new int[n + 1][k + 1];
			
			for(int i = 1; i <= n; i++) {
				int v = vArr[i - 1];
				int c = cArr[i - 1];
				for(int j = 0; j <= k; j++) {
					if(j < v)
						dp[i][j] = dp[i - 1][j];
					else
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v] + c);
				}
			}
			sb.append("#").append(tc).append(" ").append(dp[n][k]).append("\n");
		}
		System.out.println(sb);
	}
}
