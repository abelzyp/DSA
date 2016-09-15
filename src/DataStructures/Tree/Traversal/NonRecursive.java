package DataStructures.Tree.Traversal;

import java.util.Stack;

/*
 * 非递归的方法实现三种遍历
 * 
 * 来源：
 * 		程序员代码面试指南
 * 			---IT名企算法与数据结构题目最优解
 */
public class NonRecursive {
	/*
	 * 步骤：
	 * 		1.申请一个新的栈，记为stack。然后将头节点head压入stack中。
	 * 		2.从stack中弹出栈顶结点，记为cur，然后打印cur节点的值，再将节点cur的右孩子（不为空的话）先压入stack中，最后将cur的左孩子（不为空的话）压入stack中。 
	 * 		3.不断重复步骤2，直到stack为空，全部过程结束。
	 */
	public void preOrderUnRecur(Node head) {
		System.out.print("pre-order: ");
		if (head != null) {
			Stack<Node> stack = new Stack<>();
			stack.add(head);
			while (!stack.isEmpty()) {
				head = stack.pop();
				System.out.print(head.value + " ");
				if (head.right != null) {
					stack.push(head.right);
				}
				if (head.left != null) {
					stack.push(head.left);
				}
			}
		}
		System.out.println();
	}

	/*
	 * 步骤：
	 * 		1.申请一个新的栈，记为stack。初始时，令变量cur=head。
	 * 		2.先把cur节点压入栈中，对以cur节点为头的整棵子树来说，依次把左边界压入栈中，即不停地令cur=cur.left，然后重复步骤2。
	 * 		3.不断重复步骤2，直到发现cur为空，此时从stack中弹出一个节点，记为node。打印node的值，并且让cur=node.right，然后继续重复步骤2。
	 * 		4.当stack为空且cur为空时，整个过程停止。
	 */
	public void inOrderUnRecur(Node head) {
		System.out.print("in-order: ");
		if (head != null) {
			Stack<Node> stack = new Stack<>();
			while (!stack.isEmpty() || head != null) {
				if (head != null) {
					stack.push(head);
					head = head.left;
				} else {
					head = stack.pop();
					System.out.print(head.value + " ");
					head = head.right;
				}
			}
		}
		System.out.println();
	}
	
	/*
	 * 用非递归的方式实现二叉树的后序遍历有两种方法。
	 */
	
	/*
	 * 方法一：用两个栈实现后序遍历。
	 * 
	 * 步骤：
	 * 		1.申请一个栈，记为s1，然后将头节点head压入s1中。
	 * 		2.从s1中弹出的节点记为cur，然后依次将cur的左孩子和右孩子压入s1中。
	 * 		3.在整个过程中，每一个从s1中弹出的节点都放进s2中。
	 * 		4.不断重复步骤2和步骤3，直到s1为空，过程停止。
	 * 		5.从s2中依次弹出节点并打印，打印的顺序就是后序遍历的顺序。
	 */
	public void posOrderUnRecur1(Node head) {
		System.out.print("pos-order: ");
		if (head != null) {
			Stack<Node> s1 = new Stack<>();
			Stack<Node> s2 = new Stack<>();
			s1.push(head);
			while (!s1.isEmpty()) {
				head = s1.pop();
				s2.push(head);
				if (head.left != null) {
					s1.push(head.left);
				}
				if (head.right != null) {
					s1.push(head.right);
				}
			}
			while (!s2.isEmpty()) {
				System.out.print(s2.pop().value + " ");
			}
		}
		System.out.println();
	}
	
	/*
	 * 方法二：用一个栈实现后序遍历。
	 * 
	 * 步骤：
	 * 		1.申请一个栈，记为stack，将头节点压入stack，同时设置两个变量h和c。在整个流程中，h代表最近一次弹出并打印的节点，c代表stack的栈顶节点，初始时h为头节点，c为null。
	 * 		2.每次令c等于当前stack的栈顶节点，但是不从是stack中弹出，此时分以下三种情况。
	 * 			a)如果c的左孩子不为null，并且h不等于c的左孩子，也不等于c的右孩子，则把c的左孩子压入stack中。(原因注释1)
	 * 			b)如果条件a不成立，并且c的右孩子不为null，h不等于c的右孩子，则把c的右孩子压入stack中。(原因注释2)
	 * 			c)如果条件a和b都不成立，说明c的左子树和右子树都已经打印完毕，那么从stack中弹出c并打印，然后令h=c。
	 * 		3.一直重复步骤2，直到stack为空，过程停止。
	 * 
	 * 注释1：首先h的意义是最近一次弹出并打印的节点，所以如果h等于c的左孩子或者右孩子，说明c的左子树与右子树已经打印完毕，此时不应该再将c的左孩子放入stack中。否则，说明左孩子还没有处理过，那么此时将c的左孩子压入stack中。
	 * 注释2：如果h等于c的右孩子，说明c的右子树已经打印完毕，此时不应该再将c的右孩子放入stack中。否则，说明右子树还没处理过，此时将c的右孩子压入stack中。
	 */
	public void posOrderUnRecur2(Node h) {
		System.out.print("pos-order: ");
		if (h != null) {
			Stack<Node> stack = new Stack<>();
			stack.push(h);
			Node c = null;
			while (!stack.isEmpty()) {
				c = stack.peek();
				if (c.left != null && h != c.left && h != c.right) {
					stack.push(c.left);
				} else if (c.right != null && h != c.right) {
					stack.push(c.right);
				} else {
					System.out.print(stack.pop().value + " ");
					h = c;
				}
			}
		}
		System.out.println();
	}
}
