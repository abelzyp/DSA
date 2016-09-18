package Algorithm.Sorting.MergeSort;

import java.util.Arrays;

public class MgSortTest {
	public static void main(String[] args) {
		int a[] = { 80, 30, 60, 40, 20, 10, 50, 70 };
		MgSort.mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
}
