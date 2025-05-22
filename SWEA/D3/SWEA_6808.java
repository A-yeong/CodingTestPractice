package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_6808 {
	static int t;
	static int[] gyu;
	static int[] in;
	static boolean[] used;
	static int[] picked;
	
	static int win, lose;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			boolean[] isUsed = new boolean[19];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			gyu = new int[9];
			in = new int[9];
			picked = new int[9];
			used = new boolean[9];
			
			for(int i = 0; i < 9; i++) {
				gyu[i] = Integer.parseInt(st.nextToken());
				isUsed[gyu[i]] = true;
			}
			
			int idx = 0;
			for(int i = 1; i <= 18; i++) {
				if(!isUsed[i])
					in[idx++] = i;
			}
			
			win = 0;
			lose = 0;
			perm(0);
			
			sb.append("#").append(tc).append(" ").append(win).append(" ").append(lose).append("\n");
		}
		System.out.println(sb);
	}
	
	private static void perm(int depth) {
		if(depth == 9) {
			simulate();
			return;
		}
		
		for(int i = 0; i < 9; i++) {
			if(!used[i]) {
				used[i] = true;
				picked[depth] = in[i];
				perm(depth + 1);
				used[i] = false;
			}
		}
	}
	
	private static void simulate() {
		int gyuScore = 0;
		int inScore = 0;
		
		for(int i = 0; i < 9; i++) {
			if(gyu[i] > picked[i])
				gyuScore += gyu[i] + picked[i];
			else
				inScore += gyu[i] + picked[i];
		}
		if(gyuScore > inScore) win++;
		else if(gyuScore < inScore) lose++;
	}
}
