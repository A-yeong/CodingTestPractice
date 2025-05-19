package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_6190 {
	static int t, n, ans;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			ans = -1;
			for(int i = n - 1; i >= 0; i--) {
				for(int j = i - 1; j >= 0; j--) {
					int ij = arr[i] * arr[j];
					if(isDanjo(ij)) {
						ans = ij;
						break;
					}
				}
			}
			
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
			System.out.println(sb);
		}
	}
	
	private static boolean isDanjo(int x) {
		String s = Integer.toString(x);
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i - 1) > s.charAt(i))
				return false;
		}
		return true;
	}
}
