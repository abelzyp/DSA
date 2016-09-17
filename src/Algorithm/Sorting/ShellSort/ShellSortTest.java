package Algorithm.Sorting.ShellSort;

public class ShellSortTest {
	public static void main(String[] args) {
		int i;
		int a[] = { 80, 30, 60, 40, 20, 10, 50, 70 };

		System.out.printf("before sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");

		ShellSort.shellSort1(a, a.length);
		// ShellSort.shellSort2(a, a.length);

		System.out.printf("after  sort:");
		for (i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.printf("\n");
	}
}
