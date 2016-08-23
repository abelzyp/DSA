package DataStructures.Linear;

/*
 * 顺序栈，以String举例
 */
public class SeqStack {
	private static final int MAXSIZE = 100;
	private int top;
	private String[] data;

	public SeqStack() {
		Init_SeqStack(MAXSIZE);
	}

	private void Init_SeqStack(int size) {
		data = new String[size];
		top = -1;
	}

	// 判断栈空
	public int Empty_SeqStack() {
		if (top == -1)
			return 1;
		else
			return 0;
	}

	// 判断栈满
	public int Full_SeqStack() {
		if (top == MAXSIZE - 1)
			return 1;
		else
			return 0;
	}

	// 入栈
	public int Push_SeqStack(String x) {
		if (Full_SeqStack() == 1)
			return 0;
		else {
			top++;
			data[top] = x;
			return 1;
		}
	}

	// 出栈
	public String Pop_SeqStack() {
		if (Empty_SeqStack() == 1)
			return null;
		else
			return data[top--];
	}

	// 读栈顶
	public String Top_SeqStack() {
		if (Empty_SeqStack() == 1)
			return null;
		else
			return data[top];
	}

	// 栈有多少元素，栈长度
	public int Length_SeqStack() {
		return top + 1;
	}
}
