package Tree;

/*
 * 树的孩子链表表示
 * 		以char类型数据树表示
 */
class ChildNode {
	int childcode;
	ChildNode nextchild;
}

class CTreeNode {
	char data;
	ChildNode firstchild;
}

public class ChildLinkTree {
	public static void main(String[] args) {
		CTreeNode[] cTree = new CTreeNode[9];
		cTree[0].data = 'A';
		cTree[1].data = 'B';
		cTree[2].data = 'C';
		cTree[3].data = 'D';
		cTree[4].data = 'E';
		cTree[5].data = 'F';
		cTree[6].data = 'G';
		cTree[7].data = 'H';
		cTree[8].data = 'I';

		ChildNode cn1 = new ChildNode();
		cn1.childcode = 1;
		cTree[0].firstchild = cn1;

		ChildNode cn2 = new ChildNode();
		cn2.childcode = 2;
		cn1.nextchild = cn2;

		ChildNode cn3 = new ChildNode();
		cn3.childcode = 3;
		cTree[1].firstchild = cn3;

		ChildNode cn4 = new ChildNode();
		cn4.childcode = 4;
		cn3.nextchild = cn4;

		ChildNode cn5 = new ChildNode();
		cn5.childcode = 5;
		cn4.nextchild = cn5;

		ChildNode cn6 = new ChildNode();
		cn6.childcode = 6;
		cTree[2].firstchild = cn6;

		ChildNode cn7 = new ChildNode();
		cn7.childcode = 7;
		cTree[4].firstchild = cn7;

		ChildNode cn8 = new ChildNode();
		cn8.childcode = 8;
		cn7.nextchild = cn8;
	}
}
