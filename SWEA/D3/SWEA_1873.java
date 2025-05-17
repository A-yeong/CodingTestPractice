package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1873 {
	static int t, h, w, n;
	static char[][] map;
	static char[] input;
	static int carX, carY;
	static char dir;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			map = new char[h][w];
			for (int i = 0; i < h; i++) {
				map[i] = br.readLine().toCharArray();
				for (int j = 0; j < w; j++) {
					if("^v<>".indexOf(map[i][j]) != -1) {
						carX = i;
						carY = j;
						dir = map[i][j];
					}
				}
			}
			
			n = Integer.parseInt(br.readLine());
			input = br.readLine().toCharArray();
			
			for (char cmd: input) {
				execute(cmd);
			}
			
			sb.append("#").append(tc).append(" ");
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
	
	
	// 명령 실행
	private static void execute(char cmd) {
		int nx, ny;
		
		switch(cmd) {
			case 'U':
				dir = '^';
				map[carX][carY] = dir;
				nx = carX - 1;
				ny = carY;
				if(isIn(nx, ny) && map[nx][ny] == '.') {
					moveTo(nx, ny);
				}
				break;
			
			case 'D':
				dir = 'v';
				map[carX][carY] = dir;
				nx = carX + 1;
				ny = carY;
				if(isIn(nx, ny) && map[nx][ny] == '.') {
					moveTo(nx, ny);
				}
				break;
				
			case 'L':
				dir = '<';
				map[carX][carY] = dir;
				nx = carX;
				ny = carY - 1;
				if(isIn(nx, ny) && map[nx][ny] == '.') {
					moveTo(nx, ny);
				}
				break;
				
			case 'R':
				dir = '>';
				map[carX][carY] = dir;
				nx = carX;
				ny = carY + 1;
				if(isIn(nx, ny) && map[nx][ny] == '.') {
					moveTo(nx, ny);
				}
				break;
				
			case 'S':
				shoot();
				break;
		}
		
	}
	
	
	// 맵 범위 체크
	private static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < h && y < w;
	}
	
	
	// 전차 이동
	private static void moveTo(int x, int y) {
		map[carX][carY] = '.';
		carX = x;
		carY = y;
		map[carX][carY] = dir;
	}
	
	// 포탄 발사
	private static void shoot() {
		int[] dx = {-1, 1, 0, 0}; // 위, 아래, 왼, 오
		int[] dy = {0, 0, -1, 1};
		int d = "^v<>".indexOf(dir); // 방향 인덱스
		int nx = carX + dx[d];
		int ny = carY + dy[d];

		while (isIn(nx, ny)) {
			if (map[nx][ny] == '*') {
				map[nx][ny] = '.';
				break;
			} else if (map[nx][ny] == '#') {
				break;
			}
			nx += dx[d];
			ny += dy[d];
		}
	}
}
