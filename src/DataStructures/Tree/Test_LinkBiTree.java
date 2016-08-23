package DataStructures.Tree;

public class Test_LinkBiTree {
	public static void main(String[] args) {
		LinkBiTree lbt = new LinkBiTree();
		//建立一棵带头节点的二叉树
		LinkBiTree lbt1 = lbt.Initiate1();
		//定义二叉树lbt1的左右孩子
		LinkBiTree lbt11 = lbt.Initiate1();
		LinkBiTree lbt12 = lbt.Initiate1();
		lbt1.Create("a", lbt11, lbt12);
		//上面代码执行完，lbt1就有一个根节点a了
		
		LinkBiTree lbt111 = lbt.Initiate1();
		LinkBiTree lbt112 = lbt.Initiate1();
		lbt11.Create("b", lbt111, lbt112);
		//上面代码执行完，这棵树就有两个节点了
		
		lbt.PreOrder(lbt1.bt);
	}
}
