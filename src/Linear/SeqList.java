package Linear;

/*
 * 实现一个String类型的线性表，顺序实现，底层结构是数组
 */
public class SeqList {
	private static final int MAX_SIZE = 100;// 定义数组的最大容量
	private int last;// 用于存储顺序表最后一个元素的存储位置
	private String[] data;// 顺序表的存储空间

	public SeqList() {
		Init_SeqList(MAX_SIZE);
	}

	// 初始化
	private void Init_SeqList(int size) {
		data = new String[size];
		last = -1;
	}

	// 求长度
	public int Length_SeqList() {
		return last + 1;
	}

	// 插入
	public int Insert_SeqList(int i, String x) {
		int j;
		if (last == MAX_SIZE - 1) {
			System.out.println("表满");
			return -1;
		}
		if (i < 1 || i > last + 2) {
			System.out.println("位置错");
			return 0;
		}
		for (j = last; j >= i - 1; j--) {
			data[j + 1] = data[j];
		}
		data[i - 1] = x;
		last++;
		return 1;
	}

	// 删除
	public int Delete_SeqList(int i) {
		int j;
		if (i < 0 || i > last + 1) {
			System.out.println("不存在第i个元素");
			return 0;
		}
		for (j = i; j <= last; j++) {
			data[j - 1] = data[j];
		}
		last--;
		return 1;
	}

	// 查找
	public int Location_SeqList(String x) {
		int i = 0;
		while (i <= last && data[i] != x) {
			i++;
		}
		if (i > last)
			return -1;
		else
			return i;
	}
}
