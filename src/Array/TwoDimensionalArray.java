package Array;

/*
 * 二维数组测试
 */
public class TwoDimensionalArray {
	public static void main(String[] args) {
		test1();
		System.out.println("-----");
		test2();
		System.out.println("-----");
		test3();
		System.out.println("-----");
		test4();
	}

	private static void test1() {
		int[] arr = new int[3];
		System.out.println(arr);// 这里打印地址值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

	private static void test2() {
		int[] arr = new int[] { 1, 1, 1 };
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

	private static void test3() {
		int[][] arr = new int[3][2];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println(arr[0][0]);
		System.out.println(arr[2][1]);
	}

	private static void test4() {
		int[][] arr = new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);
		arr[0] = new int[1];
		arr[1] = new int[2];
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
	}
}
