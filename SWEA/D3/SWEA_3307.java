package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3307 {
	static int t, n, ans;
	static int[] dp;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n];
			dp = new int[n];
			ans = 1;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			dp[0] = 1;
			for(int i = 1; i < n; i++) {
				dp[i] = 1; // 기본값 1 초기화
				for(int j = 0; j < i; j++) { // 현재 위치 -1 까지 작은 값
					// 원소 값이 전 원소보다 크고, 전 dp값이 1보다 크거나 같으면
					if(arr[j] < arr[i] && dp[i] <= dp[j])
						dp[i] = dp[j] + 1;
				}
				ans = Math.max(ans, dp[i]);
			}
			
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);
	}
}
