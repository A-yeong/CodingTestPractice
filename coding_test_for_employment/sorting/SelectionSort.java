package sorting;

/*
선택 정렬(selection sort)
- 가장 작은 값을 선택하여 앞으로 보내는 과정 반복

시간복잡도
- N번만큼 가장 작은 수를 찾아서 맨 앞으로 보내야 함
- 전체 연산 횟수 : N + (N - 1) + (N - 2) + ... + 2 = (N^2 + N - 2) / 2
- 빅오 표기법에 따라 O(N^2)
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // 현재의 범위에서 가장 작은 원소의 인덱스가 min_index에 담기도록
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if(arr[min_index] > arr[j])
                    min_index = j;
            }
            //가장 작은 원소가 제일 처음에 오도록 스와프
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        //출력
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
