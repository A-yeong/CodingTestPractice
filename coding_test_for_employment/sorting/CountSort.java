package sorting;

/*
계수 정렬(Count Sort)
- 특정한 조건이 부합할 때만 사용, 매우 빠르게 동작
    - 데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때 사용 가능
- 때에 따라 아주 비효율적일 수도 있음 ex) 0, 9999999만 존재하는 경우
- 동일한 값을 가지는 데이터가 여러 개 등장할 때 효과적으로 사용 ex) 성적 정렬하기

시간복잡도
- 데이터 개수 N, 데이터(양수) 중 최댓값이 K일 때, 최악의 경우에도 O(N+K)

공간복잡도
- O(N+K)
 */

public class CountSort {
    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n = 15;
        // 모든 원소의 값이 0보다 크거나 같다고 가정
        int[]arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        // 모든 범위를 포함하는 배열 선언(모든 값은 0으로 초기화)
        int[] cnt = new int[MAX_VALUE + 1];
        for (int i = 0; i < n; i++) {
            cnt[arr[i]] += 1; // 각 데이터에 해당하는 인덱스의 값 증가
        }
        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
