package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3314 {
	static int t;
	static int[] scores = new int[5];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// scores 입력
			for(int i = 0; i < 5; i++) {
				int input = Integer.parseInt(st.nextToken());
				if(input < 40)
					scores[i] = 40;
				else
					scores[i] = input;
			}
			
			// 합계 구하기
			int sum = 0;
			for(int i = 0; i < 5; i++) {
				sum += scores[i];
			}
			int ans = sum / 5;
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);
	}
}
