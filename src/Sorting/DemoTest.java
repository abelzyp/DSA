package Sorting;

public class DemoTest {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 5, 2, 3 };
		MergeSortDemo1.mergeSort(A,6);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
	}
}
