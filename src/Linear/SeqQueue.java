package Linear;

/*
 * 顺序队列，以String举例，一般来说都是循环队列
 */
public class SeqQueue {
	private static final int MAXSIZE = 100;
	private int front;
	private int rear;
	private int num;// 队列元素个数
	private String[] data;

	public SeqQueue() {
		Init_SeqQueue(MAXSIZE);
	}

	private void Init_SeqQueue(int size) {
		data = new String[size];
		front = size - 1;
		rear = size - 1;
		num = 0;
	}

	// 判队空
	public int Empty_SeqQueue() {
		if (num == 0)
			return 1;
		else
			return 0;
	}

	// 判队满
	public int Full_SeqQueue() {
		if (num == MAXSIZE)
			return 1;
		else
			return 0;
	}

	// 入队
	public int In_SeqQueue(String x) {
		if (num == MAXSIZE) {
			System.out.println("队满，不能入队");
			return -1;
		} else {
			rear = (rear + 1) % MAXSIZE;
			data[rear] = x;
			num++;
			return 1;
		}
	}

	// 出队
	public String Out_SeqQueue() {
		if (num == 0) {
			System.out.println("队空，不能出队");
			return null;
		} else {
			front = (front + 1) % MAXSIZE;
			num--;
			return data[front];
		}
	}

	// 读队头
	public String Front_SeqQueue() {
		int p;
		if (num == 0) {
			System.out.println("队空，没有元素可以读");
			return null;
		} else {
			p = (front + 1) % MAXSIZE;
			return data[p];
		}
	}
}
