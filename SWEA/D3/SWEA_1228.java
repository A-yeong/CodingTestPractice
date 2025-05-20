package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SWEA_1228 {
	static int t = 10;
	static int n, m;
	static ArrayList<Integer> list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			list = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			m = Integer.parseInt(br.readLine());
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
