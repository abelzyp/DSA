package DataStructures.Tree.Morris;

/*
 * 神级遍历方法之后序遍历
 * 
 * 步骤：
 * 		Morris后序遍历的实现也是Morris中序遍历实现的改写，但包含更复杂的调整过程。
 * 		总的来说，就是依次逆序打印所有节点的左子树的右边界，打印的时机放在步骤2的条件a被触发的时候，也就是说调整回去的过程发生的时候。
 */
public class MorrisPos {
	public static void morrisPos(Node head) {
		if (head == null) {
			return;
		}
		Node cur1 = head;
		Node cur2 = null;
		while (cur1 != null) {
			cur2 = cur1.left;
			if (cur2 != null) {
				while (cur2.right != null && cur2.right != cur1) {
					cur2 = cur2.right;
				}
				if (cur2.right == null) {
					cur2.right = cur1;
					cur1 = cur1.left;
					continue;
				} else {
					cur2.right = null;
					printEdge(cur1.left);
				}
			}
			cur1 = cur1.right;
		}
		printEdge(head);
		System.out.println();
	}

	private static void printEdge(Node head) {
		Node tail = reverseEdge(head);
		Node cur = tail;
		while (cur != null) {
			System.out.print(cur.value + " ");
			cur = cur.right;
		}
		reverseEdge(tail);
	}

	private static Node reverseEdge(Node from) {
		Node pre = null;
		Node next = null;
		while (from != null) {
			next = from.right;
			from.right = pre;
			pre = from;
			from = next;
		}
		return pre;
	}
}
