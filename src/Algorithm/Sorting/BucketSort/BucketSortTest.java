package Algorithm.Sorting.BucketSort;

public class BucketSortTest {
	public static void main(String[] args) {
		int i;
		int a[] = { 8, 2, 3, 4, 3, 6, 6, 3, 9 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		BucketSort.bucketSort(a, 10); // 桶排序

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
