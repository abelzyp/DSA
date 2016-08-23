package DataStructures.Tree;

/*
 * 线索二叉树类，以String举例
 */
public class LinkBiThrTree {
	private LinkBiThrNode head;

	public LinkBiThrTree() {
		head = new LinkBiThrNode(null, null);
	}

	private LinkBiThrNode pre;// 始终指向刚刚访问过的节点

	// 建立中序线索二叉树
	public LinkBiThrTree InOrderThr(LinkBiThrTree T) {
		T.head.ltag = 0;
		T.head.rtag = 1;
		T.head.rchild = T.head;// 右引用回指
		if (T.head.lchild == null) {
			T.head.lchild = T.head;
		} else {
			pre = head;
			InThreading(T.head.lchild);
			pre.rchild = head;
			pre.rtag = 1;
			T.head.rchild = pre;
		}
		return null;
	}

	// 通过中序遍历进行中序线索化
	private void InThreading(LinkBiThrNode p) {
		if (p != null) {
			InThreading(p.lchild);
			if (p.lchild == null) {
				p.ltag = 1;
				p.lchild = pre;
			}
			if (pre.rchild == null) {
				pre.rtag = 1;
				pre.rchild = p;
			}
			pre = p;
			InThreading(p.rchild);
		}
	}
}
