package Algorithm.Sorting.BubbleSort;

/*
 * 冒泡排序
 * 
 * 冒泡排序(Bubble Sort)的基本思想是：
 * 		它会遍历若干次要排序的数列，每次遍历时，它都会从前往后依次的比较
 * 		相邻两个数的大小；如果前者比后者大，则交换它们的位置。这样，一次
 * 		遍历之后，最大的元素就在数列的末尾！ 采用相同的方法再次遍历时，第
 * 		二大的元素就被排列在最大元素之前。重复此操作，直到整个数列都有序
 * 		为止！
 */
public class BubbleSort {
	/*
	 * 冒泡排序
	 *
	 * 参数说明：
	 *     a -- 待排序的数组
	 *     n -- 数组的长度
	 */
	public static void bubbleSort1(int[] a, int n) {
		int i, j;

		for (i = n - 1; i > 0; i--) {
			// 将a[0...i]中最大的数据放在末尾
			for (j = 0; j < i; j++) {

				if (a[j] > a[j + 1]) {
					// 交换a[j]和a[j+1]
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}
	
	/*
	 * 冒泡排序(改进版)
	 *
	 * 参数说明：
	 *     a -- 待排序的数组
	 *     n -- 数组的长度
	 */
	public static void bubbleSort2(int[] a, int n) {
		int i, j;
		int flag; // 标记

		for (i = n - 1; i > 0; i--) {

			flag = 0; // 初始化标记为0
			// 将a[0...i]中最大的数据放在末尾
			for (j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					// 交换a[j]和a[j+1]
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;

					flag = 1; // 若发生交换，则设标记为1
				}
			}

			if (flag == 0)
				break; // 若没发生交换，则说明数列已有序。
		}
	}
}
