package DataStructures.Tree;

/*
 * 二叉树 链式存储，以String举例
 */
public class LinkBiTree {
	protected LinkBiTNode bt;// 指示二叉树根节点

	public LinkBiTree() {
		bt = null;
	}

	// 建立一棵带头节点的二叉树
	public LinkBiTree Initiate1() {
		LinkBiTNode bt = new LinkBiTNode(null, null);
		LinkBiTree T = new LinkBiTree();
		T.bt = bt;
		return T;
	}

	// 建立一棵不带头结点的二叉树
	public LinkBiTree Initiate2() {
		LinkBiTree T = new LinkBiTree();
		return T;
	}

	// 建立一棵以x为根节点，以lbt和rbt为左右子树的二叉树
	public LinkBiTree Create(String x, LinkBiTree lbt, LinkBiTree rbt) {
		LinkBiTree T = new LinkBiTree();
		LinkBiTNode bt = new LinkBiTNode(x, null, null);
		T.bt = bt;
		T.bt.lchild = lbt.bt;
		T.bt.rchild = rbt.bt;
		return T;
	}

	// 在parent所指的节点和左子树之间插入x
	public static LinkBiTree InsertL(LinkBiTree T, String x, LinkBiTNode parent) {
		if (parent == null) {
			System.out.println("插入出错");
			return null;
		}
		LinkBiTNode p = new LinkBiTNode(x, null, null);
		if (parent.lchild == null)
			parent.lchild = p;
		else {
			p.lchild = parent.lchild;
			parent.lchild = p;
		}
		return T;
	}

	// 在parent所指的节点和右子树之间插入x
	public static LinkBiTree InsertR(LinkBiTree T, String x, LinkBiTNode parent) {
		if (parent == null) {
			System.out.println("插入出错");
			return null;
		}
		LinkBiTNode p = new LinkBiTNode(x, null, null);
		if (parent.rchild == null)
			parent.rchild = p;
		else {
			p.rchild = parent.rchild;
			parent.rchild = p;
		}
		return T;
	}

	// 在二叉树中删除parent左子树
	public LinkBiTree DeleteL(LinkBiTree T, LinkBiTNode parent) {
		if (parent == null || parent.lchild == null) {
			System.out.println("删除出错");
			return null;
		}
		parent.lchild = null;
		return T;
	}

	// 在二叉树中删除parent右子树
	public LinkBiTree DeleteR(LinkBiTree T, LinkBiTNode parent) {
		if (parent == null || parent.rchild == null) {
			System.out.println("删除出错");
			return null;
		}
		parent.rchild = null;
		return T;
	}

	/*
	 * 二叉树遍历（递归方法遍历）
	 */
	// 遍历先需要一个节点访问函数
	private static void Visit(LinkBiTNode bt) {
		System.out.println("节点的值是：" + bt.data);
	}

	// 先序遍历
	public void PreOrder(LinkBiTNode bt) {
		if (bt == null)
			return;
		Visit(bt);
		PreOrder(bt.lchild);
		PreOrder(bt.rchild);
	}

	// 中序遍历
	public void InOrder(LinkBiTNode bt) {
		if (bt == null)
			return;
		InOrder(bt.lchild);
		Visit(bt);
		InOrder(bt.rchild);
	}

	// 后序遍历
	public void PostOrder(LinkBiTNode bt) {
		if (bt == null)
			return;
		PostOrder(bt.lchild);
		PostOrder(bt.rchild);
		Visit(bt);
	}

	/*
	 * 二叉树遍历（非递归方法遍历）
	 */
	// 先序遍历
	public void NRPreOrder(LinkBiTNode bt) {

	}
}
