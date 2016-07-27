package Sorting;

/*
 * 对于一个int数组，请编写一个选择排序算法，对数组元素排序。
 * 给定一个int数组A及数组的大小n，请返回排序后的数组。
 */
public class SelectionSort {
	public static int[] selectionSort(int[] A, int n) {
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
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
