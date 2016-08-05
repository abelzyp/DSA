package Sorting;

/*
 * 选择排序算法对int数组元素进行排序
 */
public class SelectionSort {
	public static int[] selectionSort(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int min = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[min]) {
					min = j;
				}
			}
			if (min != i) {
				int tmp = A[min];
				A[min] = A[i];
				A[i] = tmp;
			}
		}
		return A;
	}
}
