package Algorithm.Searching;

/*
 * 顺序查找	时间复杂度O(n)
 * 		元素没有顺序，需要扫描数组中所有元素，逐个和k比较。
 * 		相等时证明查找成功，返回元素位置。
 * 		如果扫描结束没有发现和k相等的元素，则查找不成功，返回0。
 */
public class SequentialSearch {
	public static int Search(int[] arr, int value) {
		if (arr == null || arr.length == 0)
			return -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value)
				return i;
		}
		return -1;
	}
}
