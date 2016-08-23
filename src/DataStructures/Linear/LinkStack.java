package DataStructures.Linear;

/*
 * 链栈，以int举例
 */
public class LinkStack {
	private LinkNode top;

	public LinkStack() {
		top = null;
	}

	// 判栈空
	public int Empty_LinkStack() {
		if (top == null)
			return 1;
		else
			return 0;
	}

	// 入栈
	public LinkNode Push_LinkStack(int x) {
		LinkNode p = new LinkNode(null);
		p.data = x;
		p.next = top;
		top = p;
		return top;
	}

	// 出栈
	public int Pop_LinkStack() {
		LinkNode p;
		if (top == null) {
			System.out.println("栈为空了，没发出");
			return -1;
		} else {
			p = top;
			top = top.next;
			return p.data;
		}
	}

	// 读栈顶
	public int Top_LinkStack() {
		if (top == null)
			return 0;
		else
			return top.data;
	}

	// 栈长度
	public int Length_LinkStack() {
		int l = 0;
		LinkNode tmp;
		tmp = top;
		while (tmp != null) {
			tmp = tmp.next;
			l++;
		}
		return l;
	}
}
