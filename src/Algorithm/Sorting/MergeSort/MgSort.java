package Algorithm.Sorting.MergeSort;

/*
 * 归并排序算法对int数组元素进行排序
 */
public class MgSort {
	public static int[] mergeSort(int[] A) {
		sort(A, 0, A.length - 1);
		return A;
	}

	private static void sort(int[] data, int left, int right) {
		if (left < right) {
			int middle = (left + right) >> 1;
			// 划分左右
			sort(data, left, middle);
			sort(data, middle + 1, right);
			// 合并左右
			merge(data, left, middle, right);
		}
	}

	// 合并左右两个子数组
	private static void merge(int[] data, int left, int middle, int right) {
		// 临时数组
		int[] tArr = new int[right - left + 1];
		// 左边数组游标
		int l = left;
		// 右边数据游标
		int r = middle + 1;
		// 临时数组游标
		int tmp = 0;

		while (l <= middle && r <= right) {
			// 临时数组选取左、右子数组中小数值
			if (data[l] < data[r]) {
				tArr[tmp++] = data[l++];
			} else {
				tArr[tmp++] = data[r++];
			}
		}
		// 剩余的直接放入
		while (l <= middle) {
			tArr[tmp++] = data[l++];
		}
		// 剩余的直接放入
		while (r <= right) {
			tArr[tmp++] = data[r++];
		}
		// 将临时数组放回原数组相应位置
		for (int t = 0; t + left <= right; t++) {
			data[left + t] = tArr[t];
		}
	}
}