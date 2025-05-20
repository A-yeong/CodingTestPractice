package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1220 {
	static int t = 10;
	static int n, ans;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			ans = 0;
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 1. 세로 열을 String으로 만들기
			// 2. String에서 0 제거
			// 3. String에서 "12"의 개수 세기
			for(int i = 0; i < n; i++) {
				StringBuilder col = new StringBuilder();
				for(int j = 0; j < n; j++) {
					col.append(arr[j][i]);
				}
				
				// 0 제거
				String cleaned = col.toString().replace("0", "");
				
				for(int k = 0; k < cleaned.length() - 1; k++) {
					if(cleaned.charAt(k) == '1' && cleaned.charAt(k + 1) == '2') {
						ans++;
						k++; // 겹치지 않도록 스킵
					}
				}
				
			}
			
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);
	}
}
