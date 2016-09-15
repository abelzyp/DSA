package DataStructures.Tree.Traversal;

/*
 * 对二叉树的递归和非递归遍历进行验证
 */
public class Test {
	public static void main(String[] args) {
		// 创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);

		// 为节点建树
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;

		// 测试遍历方法
		// 递归遍历
		Recursive recursive = new Recursive();
		recursive.preOrderRecur(n1);
		System.out.println();
		recursive.inOrderRecur(n1);
		System.out.println();
		recursive.postOrderRecur(n1);
		System.out.println();

		// 非递归遍历
		NonRecursive nonRecursive = new NonRecursive();
		nonRecursive.preOrderUnRecur(n1);
		nonRecursive.inOrderUnRecur(n1);
		nonRecursive.posOrderUnRecur1(n1);
		nonRecursive.posOrderUnRecur2(n1);
	}
}
