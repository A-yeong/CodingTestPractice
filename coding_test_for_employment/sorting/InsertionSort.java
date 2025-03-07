package sorting;

/*
삽입 정렬
- 처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입
- 선택 정렬에 비해 구현 난이도 높지만 더 효율적으로 동작

시간 복잡도
- O(N^2) : Selection Sort와 마찬가지로 반복문이 두 번 중첩되어 사용
- 삽입정렬은 현재 리스트가 데이터에 거의 정렬되어 있는 상태라면 매우 빠르게 동작함 -> 최선의 경우 시간복잡도 O(N) (모든 데이터가 모두 정렬된 경우)
*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // i부터 1까지 감소하면서 반복
            for (int j = i; j > 0; j--) {
                // 한칸씩 왼쪽으로 이동
                if(arr[j] < arr[j - 1]) {
                    // 자신보다 큰 원소를 발견하면 위치를 바꿈
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                // 자기보다 작은 데이터를 만나면 그 위치에서 멈춤
                else break;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
