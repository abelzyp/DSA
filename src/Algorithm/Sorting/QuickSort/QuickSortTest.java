package Algorithm.Sorting.QuickSort;

public class QuickSortTest {
	public static void main(String[] args) {
		int i;
		int a[] = { 30, 40, 60, 10, 20, 50 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		QuickSort.quickSort(a, 0, a.length - 1);

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
