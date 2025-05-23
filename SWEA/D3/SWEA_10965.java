package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_10965 {
	static int t;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			long a = Long.parseLong(br.readLine());
			long result = 1;
			
			for(long i = 2; i * i <= a; i++) {
				int count = 0;
				while(a % i == 0) {
					a /= i;
					count++;
				}
				if(count % 2 != 0) {
					result *= i;
				}
			}
			
			if(a > 1)
				result *= a;
			
			sb.append("#").append(tc).append(" ").append(result).append("\n");
		}
		System.out.println(sb);
	}
}
