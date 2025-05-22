package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_9229 {
	static int t, n, m, ans;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			ans = -1;
			arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					int sum = arr[i] + arr[j];
					if(sum <= m && sum > ans) {
						ans = sum;
					}
				}
			}
			
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);
	}
}
