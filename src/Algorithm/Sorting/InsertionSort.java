package Algorithm.Sorting;

/*
 * 插入排序算法对int数组元素进行排序
 */
public class InsertionSort {
	public static int[] insertionSort(int[] A) {
		for (int i = 1; i < A.length; i++) {
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
