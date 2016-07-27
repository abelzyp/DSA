package Searching;
/**
 * 查找：
 * 		基本查找:数组元素无序(从头找到尾)
 * 		二分查找(折半查找):数组元素有序
 * 
 * 分析：
 * 		A:定义最大索引，最小索引
 * 		B:计算出中间索引
 * 		C:拿中间索引的值和要查找的值进行比较
 * 			相等：就返回当前的中间索引
 * 			不相等：
 * 				大	左边找
 * 				小	右边找
 * 		D:重新计算出中间索引
 * 			大	左边找
 * 				max = mid - 1;
 * 			小	右边找
 * 				min = mid + 1;
 * 		E:回到B
 * @author zhangzhang
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66 };
		System.out.println("索引是：" + binarySearch(arr, 44));
	}

	public static int binarySearch(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;

		int mid = (min + max) / 2;
		while (value != arr[mid]) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}

			// 加入判断
			if (min > max) {
				return -1;
			}

			mid = (min + max) / 2;
		}
		return mid;
	}
}
