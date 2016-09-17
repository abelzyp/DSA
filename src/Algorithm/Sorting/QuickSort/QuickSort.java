package Algorithm.Sorting.QuickSort;

/*
 * 快速排序
 * 
 * 快速排序(Quick Sort)使用分治法策略。它的基本思想是：
 * 		选择一个基准数，通过一趟排序将要排序的数据分割成独立的两部分；
 * 		其中一部分的所有数据都比另外一部分的所有数据都要小。然后，再按
 * 		此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，
 * 		以此达到整个数据变成有序序列。
 * 
 * 对挖坑填数进行总结：
 * 		1．i =L; j = R; 将基准数挖出形成第一个坑a[i]。
 * 		2．j--由后向前找比它小的数，找到后挖出此数填前一个坑a[i]中。
 * 		3．i++由前向后找比它大的数，找到后也挖出此数填到前一个坑a[j]中。
 * 		4．再重复执行2，3二步，直到i==j，将基准数填入a[i]中。
 */
public class QuickSort {
	/*
	 * 快速排序
	 *
	 * 参数说明：
	 *     a -- 待排序的数组
	 *     l -- 数组的左边界(例如，从起始位置开始排序，则l=0)
	 *     r -- 数组的右边界(例如，排序截至到数组末尾，则r=a.length-1)
	 */
	public static void quickSort(int[] a, int l, int r) {

		if (l < r) {
			int i, j, x;

			i = l;
			j = r;
			x = a[i];
			while (i < j) {
				while (i < j && a[j] > x)
					j--; // 从右向左找第一个小于x的数
				if (i < j)
					a[i++] = a[j];
				while (i < j && a[i] < x)
					i++; // 从左向右找第一个大于x的数
				if (i < j)
					a[j--] = a[i];
			}
			a[i] = x;
			quickSort(a, l, i - 1); /* 递归调用 */
			quickSort(a, i + 1, r); /* 递归调用 */
		}
	}
}
