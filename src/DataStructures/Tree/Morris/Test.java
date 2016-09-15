package DataStructures.Tree.Morris;

/*
 * 对二叉树的神级遍历进行验证
 */
public class Test {
	public static void main(String[] args) {
		// 创建节点
		Node n4 = new Node(4);
		Node n2 = new Node(2);
		Node n6 = new Node(6);
		Node n1 = new Node(1);
		Node n3 = new Node(3);
		Node n5 = new Node(5);
		Node n7 = new Node(7);

		// 为节点建树
		n4.left = n2;
		n4.right = n6;
		n2.left = n1;
		n2.right = n3;
		n6.left = n5;
		n6.right = n7;

		// 测试遍历方法
		// MorrisIn.morrisIn(n4);
		// MorrisPre.morrisPre(n4);
		MorrisPos.morrisPos(n4);
	}
}
