package Algorithm.Sorting;

/*
 * 对挖坑填数进行总结:
 * 		1．i =L; j = R; 将基准数挖出形成第一个坑a[i]。
 * 		2．j--由后向前找比它小的数，找到后挖出此数填前一个坑a[i]中。
 * 		3．i++由前向后找比它大的数，找到后也挖出此数填到前一个坑a[j]中。
 * 		4．再重复执行2，3二步，直到i==j，将基准数填入a[i]中。
 * 
 * 注1：有的书上是以中间的数作为基准数的，要实现这个方便非常方便，直接将中间的数和第一个数进行交换就可以了。
 */
public class QuickSortBetter {
	public static void quick_sort(int s[], int l, int r) {
		if (l < r) {
			// Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
			int i = l, j = r, x = s[l];
			while (i < j) {
				while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
					j--;
				if (i < j)
					s[i++] = s[j];

				while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
					i++;
				if (i < j)
					s[j--] = s[i];
			}
			s[i] = x;
			quick_sort(s, l, i - 1); // 递归调用
			quick_sort(s, i + 1, r);
		}
	}
}
