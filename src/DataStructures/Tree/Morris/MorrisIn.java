package DataStructures.Tree.Morris;

/*
 * 神级遍历方法之中序遍历
 * 
 * 步骤：
 * 		1.假设当前节点的头节点为h，让h的左子树中最右节点的right指针指向h，然后h的左子树继续步骤1的过程，直到遇到某一个节点没有左子树时记为node，进入步骤2。
 * 		2.从node开始通过每个节点的right指针进行移动，并依次打印，假设移动到的节点为cur。对每个cur节点都判断cur节点的左子树中最右节点是否指向cur。
 * 			a)如果是。让cur节点的左子树中最右节点的right指针指向空，也就是把步骤1的调整后再逐渐调整回来，然后打印cur，继续通过cur的right指针移动到下一个节点，重复步骤2。
 * 			b)如果不是。以cur为头的子树重回步骤1执行。
 * 		3.步骤2最终移动到null，整个过程结束。
 */
public class MorrisIn {
	public static void morrisIn(Node head) {
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
					cur2.left = null;
				}
			}
			System.out.print(cur1.value + " ");
			cur1 = cur1.right;
		}
		System.out.println();
	}
}
