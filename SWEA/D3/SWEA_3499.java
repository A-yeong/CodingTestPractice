package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SWEA_3499 {
	static int t, n;
	static String[] inputDeck;
	static String[] suffleDeck;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			inputDeck = new String[n];
			suffleDeck = new String[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				inputDeck[i] = st.nextToken();
			}
			
			int half = (n + 1) / 2;
			int idx = 0, i = 0, j = half;
			while(i < half || j < n) {
				if(i < half) suffleDeck[idx++] = inputDeck[i++];
				if(j < n) suffleDeck[idx++] = inputDeck[j++];
			}
			
			sb.append("#").append(tc).append(" ");
			for(int k = 0; k < n; k++) {
				sb.append(suffleDeck[k]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
