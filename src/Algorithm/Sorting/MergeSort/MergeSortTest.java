package Algorithm.Sorting.MergeSort;

public class MergeSortTest {
	public static void main(String[] args) {
		int i;
		int a[] = { 80, 30, 60, 40, 20, 10, 50, 70 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		MergeSort.mergeSortUp2Down(a, 0, a.length - 1); // 归并排序(从上往下)
		// MergeSort.mergeSortDown2Up(a); // 归并排序(从下往上)

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
