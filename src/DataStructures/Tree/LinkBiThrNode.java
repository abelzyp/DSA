package DataStructures.Tree;

/*
 * 线索二叉树的节点类，以String举例
 */
public class LinkBiThrNode {
	protected String data;
	protected LinkBiThrNode lchild;
	protected LinkBiThrNode rchild;
	protected short ltag;
	protected short rtag;

	public LinkBiThrNode(String elem, LinkBiThrNode lchildval,
			LinkBiThrNode rchildval, short i, short j) {
		data = elem;
		lchild = lchildval;
		rchild = rchildval;
		ltag = i;
		rtag = j;
	}

	public LinkBiThrNode(LinkBiThrNode lchildval, LinkBiThrNode rchildval) {
		lchild = lchildval;
		rchild = rchildval;
	}
}
