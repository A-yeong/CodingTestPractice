package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_11315 {
	static int t, n;
	static char[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++ ) {
			n = Integer.parseInt(br.readLine());
			arr = new char[n][n];
			for(int i = 0; i < n; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			if(chkGaro(arr) || chkSero(arr) || chkCross(arr))
				sb.append("#").append(tc).append(" ").append("YES").append("\n");
			else
				sb.append("#").append(tc).append(" ").append("NO").append("\n");
		}
		System.out.println(sb);
	}
	
	// 가로 확인
	private static boolean chkGaro(char[][] arr) {
		for(int i = 0; i < n; i++) {
			StringBuilder garo = new StringBuilder();
			for(int j = 0; j < n; j++) {
				garo.append(arr[i][j]);
			}
			if(garo.toString().contains("ooooo"))
				return true;
		}
		return false;
	}
	
	// 세로 확인
	private static boolean chkSero(char[][] arr) {
		for(int i = 0; i < n; i++) {
			StringBuilder sero = new StringBuilder();
			for(int j = 0; j < n; j++) {
				sero.append(arr[j][i]);
			}
			if(sero.toString().contains("ooooo"))
				return true;
		}
		return false;
	}
	
	// 대각선 확인
	private static boolean chkCross(char[][] arr) {
	    for (int i = 0; i <= n - 5; i++) {
	        for (int j = 0; j <= n - 5; j++) {
	            StringBuilder diag = new StringBuilder();
	            for (int k = 0; k < Math.min(n - i, n - j); k++) {
	                diag.append(arr[i + k][j + k]);
	            }
	            if (diag.toString().contains("ooooo")) return true;
	        }
	    }

	    for (int i = 0; i <= n - 5; i++) {
	        for (int j = 4; j < n; j++) {
	            StringBuilder diag = new StringBuilder();
	            for (int k = 0; k < Math.min(n - i, j + 1); k++) {
	                diag.append(arr[i + k][j - k]);
	            }
	            if (diag.toString().contains("ooooo")) return true;
	        }
	    }

	    return false;
	}

}