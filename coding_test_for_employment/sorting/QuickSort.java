package sorting;

/*
퀵 정렬(Quick Sort)
- 기준 데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 방법
- 병합 정렬과 더불어 대부분의 프로그래밍 언어의 정렬 라이브러리의 근간
- 가장 기본적인 퀵 정렬은 첫 번째 데이터를 기준 데이터(Pivot)으로 설정

시간 복잡도
- 이상적인 경우 O(NlogN) : 분할이 절반씩 일어나는 경우
- 평균의 경우: O(NlogN)
- 최악의 경우: O(N^2)
 */

public class QuickSort {

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end) return; // 원소가 1개인 경우는 종료
        int pivot = start;
        int left = start + 1;
        int right = end;
        while(left <= right){
            // 피벗보다 큰 데이터 찾을 때까지 반복
            while(left <= end && arr[left] <= arr[pivot]) left++;
            // 피벗보다 작은 데이터 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if(left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int length = arr.length;
        quickSort(arr, 0, length - 1);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
