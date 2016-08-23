package DataStructures.Linear;

/*
 * 链队列，以int举例
 */
public class LinkQueue {
	private LinkNode front;
	private LinkNode rear;

	public LinkQueue() {
		Init_LinkQueue();
	}

	private void Init_LinkQueue() {
		front = new LinkNode(null);
		rear = front;
	}

	// 判队空
	public int Empty_LinkQueue() {
		if (front == rear)
			return 1;
		else
			return 0;
	}

	// 入队
	public int In_LinkQueue(int x) {
		LinkNode p = new LinkNode(null);
		p.data = x;
		rear.next = p;
		rear = p;
		return 1;
	}

	// 出队
	public int Out_LinkQueue() {
		LinkNode p;
		if (Empty_LinkQueue() == 1) {
			System.out.println("队空，没法出队");
			return -1;
		} else {
			p = front.next;
			front.next = p.next;
			if (front.next == null) {
				rear = front;
			}
			return p.data;
		}
	}

	// 读队头
	public int Front_LinkQueue() {
		if (Empty_LinkQueue() == 1) {
			System.out.println("队空，没发出队");
			return -1;
		} else {
			return front.next.data;
		}
	}
}
