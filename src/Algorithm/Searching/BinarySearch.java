package Algorithm.Searching;

/*
 * 折半查找	时间复杂度O(logn)
 * 		要求线性表是有序的。
 */
public class BinarySearch {
	public static int Search(int[] arr, int value) {
		if (arr == null || arr.length == 0)
			return -1;

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) >> 1;
			if (arr[mid] == value)
				return mid;
			else if (arr[mid] > value) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
