package Tree;

/*
 * 二叉树的节点,以String类型举例
 */
public class LinkBiTNode {
	protected String data;
	protected LinkBiTNode lchild;
	protected LinkBiTNode rchild;

	public LinkBiTNode(String elem, LinkBiTNode lchildval, LinkBiTNode rchildval) {
		data = elem;
		lchild = lchildval;
		rchild = rchildval;
	}

	public LinkBiTNode(LinkBiTNode lchildval, LinkBiTNode rchildval) {
		lchild = lchildval;
		rchild = rchildval;
	}
}
