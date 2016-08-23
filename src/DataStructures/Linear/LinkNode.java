package DataStructures.Linear;

/*
 * 节点类，实现一个int类型的节点
 */
public class LinkNode {
	protected int data;
	protected LinkNode next;

	LinkNode(int elem, LinkNode nextVal) {
		data = elem;
		next = nextVal;
	}

	public LinkNode(LinkNode nextVal) {
		next = nextVal;
	}
}