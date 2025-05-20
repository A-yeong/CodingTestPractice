package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO
// 왜 10개 중에 9개만 통과되는 건지 알아내기
public class SWEA_1216 {
	static char[][] arr;
	static final int L = 100;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int t = 0; t < 10; t++) {
			int tc = Integer.parseInt(br.readLine());
			arr = new char[L][L];
			
			// 글자판 입력
			for(int i = 0; i < L; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			for(int i = L; i > 0; i--) {
				if(solve(i)) {
					sb.append("#").append(tc).append(" ").append(i).append("\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
	
	private static boolean solve(int l) {
		for(int i = 0; i < L; i++) {
			for(int j = 0; j <= (L - l); j++) {
				if(solveRow(i, j, l) || solveCol(j, i, l)) return true;
			}
		}
		return false;
	}
	
	// 가로 탐색
	private static boolean solveRow(int i, int j, int l) {
		for(int k = 0; k < l / 2; k++) {
			if(arr[i][j + k] != arr[i][j + l - 1 - k]) return false;
		}
		return true;
	}
	
	// 세로 탐색
	private static boolean solveCol(int i, int j, int l) {
		for(int k = 0; k < l / 2; k++) {
			if(arr[i + k][j] != arr[i + l - 1 - k][j]) return false;
		}
		return true;
	}
}
