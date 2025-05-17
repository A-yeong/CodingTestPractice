package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SWEA_4615 {
	static int t, n, m;
	static int[][] board;
	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		t = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			board = new int[n + 1][n + 1];
			
			// 초기 돌 세팅
			board[n / 2][n / 2] = 2;
			board[n / 2 + 1][n / 2 + 1] = 2;
			board[n / 2][n / 2 + 1] = 1;
			board[n / 2 + 1][n / 2] = 1;
			
			// 돌 놓기
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int color = Integer.parseInt(st.nextToken());

				board[x][y] = color;
				flip(x, y, color);
			}
			
			// 결과 세기
			int black = 0, white = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(board[i][j] == 1) black++;
					else if(board[i][j] == 2) white++;
				}
			}
			sb.append("#").append(tc).append(" ").append(black).append(" ").append(white).append("\n");
		}
		System.out.println(sb);
	}
	
	// 뒤집기
	private static void flip(int x, int y, int color) {
		for(int dir = 0; dir < 8; dir++) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];
			boolean hasOpponent = false;
			
			while(nx >= 1 && ny >= 1 && nx <= n && ny <= n) {
				if(board[nx][ny] == 0) break; // 빈칸이면 중단
				if(board[nx][ny] == color) {
					if(hasOpponent) {
						// 다시 되돌아가면서 뒤집기
						int backX = x + dx[dir];
						int backY = y + dy[dir];
						while(backX != nx || backY != ny) {
							board[backX][backY] = color;
							backX += dx[dir];
							backY += dy[dir];
						}
					}
					break;
				} else {
					hasOpponent = true;
				}
				nx += dx[dir];
				ny += dy[dir];
			}
		}
	}
}
