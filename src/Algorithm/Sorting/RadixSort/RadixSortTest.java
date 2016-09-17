package Algorithm.Sorting.RadixSort;

public class RadixSortTest {
	public static void main(String[] args) {
		int i;
		int a[] = { 53, 3, 542, 748, 14, 214, 154, 63, 616 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		RadixSort.radixSort(a); // 基数排序

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
