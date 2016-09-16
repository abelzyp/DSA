package Algorithm.Sorting.HeapSort;

public class HeapSortTest {
	public static void main(String[] args) {
		int i;
		// int a[] = {20,30,90,40,70,110,60,10,100,50,80};
		int a[] = { 5, 6, 8, 7, 15 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		HeapSortAsc.heapSortAsc(a, a.length); // 升序排列
		// HeapSortDesc.heapSortDesc(a, a.length); // 降序排列

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
