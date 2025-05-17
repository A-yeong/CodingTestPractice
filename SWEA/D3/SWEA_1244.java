package D3;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SWEA_1244 {
	static int t, max, swapCount;
	static String number;
	static HashSet[] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		t = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			number = st.nextToken();
			swapCount = Integer.parseInt(st.nextToken());
			max = 0;
			
			// 백트래킹 중복 제거용, 각 depth마다 상태 기억
			visited = new HashSet[swapCount + 1];
			for (int i = 0; i <= swapCount; i++) {
				visited[i] = new HashSet<>();
			}
			
			dfs(number.toCharArray(), 0);
			sb.append("#").append(tc).append(" ").append(max).append("\n");
		}
		System.out.println(sb);
	}
	
	private static void dfs(char[] arr, int depth) {
		// 교환 횟수 다 사용하면 숫자로 변환하여 최대값 비교
		if(depth == swapCount) {
			int current = Integer.parseInt(new String(arr));
			max = Math.max(max, current);
			return;
		}
		
		// 현재 상태를 기록
		String currentState = new String(arr);
		if(visited[depth].contains(currentState)) return; // 같은 depth에서 동일한 숫자가 나온다면 무시
		visited[depth].add(currentState); // 처음 보는 숫자면 visited에 저장
		
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				swap(arr, i, j); // 숫자 두 자리 교환
				dfs(arr, depth + 1); // 다음 깊이 진행
				swap(arr, i, j); // 교환 원상복구
			}
		}
	}
	
	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
