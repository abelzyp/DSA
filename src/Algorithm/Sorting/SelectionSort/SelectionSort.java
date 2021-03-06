package Algorithm.Sorting.SelectionSort;

/*
 * 选择排序
 * 
 * 选择排序(Selection sort)的基本思想是：
 * 		首先在未排序的数列中找到最小(or最大)元素，然后将其存放到数列的起始位置；
 * 		接着，再从剩余未排序的元素中继续寻找最小(or最大)元素，然后放到已排序序列
 * 		的末尾。以此类推，直到所有元素均排序完毕。
 */
public class SelectionSort {
	/*
	 * 选择排序
	 *
	 * 参数说明：
	 *     a -- 待排序的数组
	 *     n -- 数组的长度
	 */
	public static void selectSort(int[] a, int n) {
		int i; // 有序区的末尾位置
		int j; // 无序区的起始位置
		int min; // 无序区中最小元素位置

		for (i = 0; i < n; i++) {
			min = i;

			// 找出"a[i+1] ... a[n]"之间的最小元素，并赋值给min。
			for (j = i + 1; j < n; j++) {
				if (a[j] < a[min])
					min = j;
			}

			// 若min!=i，则交换 a[i] 和 a[min]。
			// 交换之后，保证了a[0] ... a[i] 之间的元素是有序的。
			if (min != i) {
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
	}
}
