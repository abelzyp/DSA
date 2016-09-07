package DataStructures.Tree.Traversal;

/*
 * 用递归方式实现的三种遍历
 */
public class Recursive {
	public void preOrderRecur(Node head) {
		if (head == null)
			return;
		System.out.print(head.value + " ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}

	public void inOrderRecur(Node head) {
		if (head == null)
			return;
		inOrderRecur(head.left);
		System.out.print(head.value + " ");
		inOrderRecur(head.right);
	}

	public void postOrderRecur(Node head) {
		if (head == null)
			return;
		postOrderRecur(head.left);
		postOrderRecur(head.right);
		System.out.print(head.value + " ");
	}
}
