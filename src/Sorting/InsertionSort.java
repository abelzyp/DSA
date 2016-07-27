package Sorting;

/*
 * 对于一个int数组，请编写一个插入排序算法，对数组元素排序。
 * 给定一个int数组A及数组的大小n，请返回排序后的数组。
 */
public class InsertionSort {
	public static int[] insertionSort(int[] A, int n) {
		for (int i = 1; i < n; i++) {
			int currentValue = A[i];
			int position = i;
			for (int j = i - 1; j >= 0; j--) {
				if (A[j] > currentValue) {
					A[j + 1] = A[j];
					position--;
				} else {
					break;
				}
			}
			A[position] = currentValue;
		}
		return A;
	}
}
