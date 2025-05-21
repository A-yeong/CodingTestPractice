package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SWEA_1230 {
	static int T = 10;
	static ArrayList<Integer> list;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int tc = 1; tc <= T; tc++) {
			// list 생성
			int n = Integer.parseInt(br.readLine());
			list = new ArrayList<>();
			
			// 원본 list 생성
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			// 명령어 개수 입력 및 명령어 실행
			int m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String cmd = st.nextToken();
				if(cmd.equals("I")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					for(int i = 0; i < y; i++) {
						int s = Integer.parseInt(st.nextToken());
						list.add(x + i, s);
					}
				}
				else if(cmd.equals("D")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					for(int i = x; i < y; i++) {
						list.remove(i);
					}
				}
				else if(cmd.equals("A")) {
					int y = Integer.parseInt(st.nextToken());
					for(int i = 0; i < y; i++) {
						int s = Integer.parseInt(st.nextToken());
						list.add(s);
					}
				}
			}
			
			sb.append("#").append(tc).append(" ");
			for(int i = 0; i < 10; i++) {
				sb.append(list.get(i)).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
