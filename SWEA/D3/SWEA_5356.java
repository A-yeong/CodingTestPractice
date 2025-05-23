package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5356 {
	static int t;
	static char[][] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			arr = new char[5][15];
			
			for(int i = 0; i < 5; i++) {
				String line = br.readLine();
				for(int j = 0; j < line.length(); j++) {
					arr[i][j] = line.charAt(j);
				}
			}
			
			sb.append("#").append(tc).append(" ");
			for(int i = 0; i < 15; i++) {
				for(int j = 0; j < 5; j++) {
					if(arr[j][i] != '\0')
						sb.append(arr[j][i]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
