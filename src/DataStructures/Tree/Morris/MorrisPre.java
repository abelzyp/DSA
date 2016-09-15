package DataStructures.Tree.Morris;

/*
 * 神级遍历方法之先序遍历
 * 
 * 步骤：
 * 		Morris先序遍历的实现就是Morris中序遍历实现的简单改写。
 * 		中序遍历的打印时机放在了步骤2所描述的移动过程中，而先序遍历只要把打印时机放在步骤1发生的时候即可。
 * 		步骤1发生的时候，正在处理以h为头的子树，并且是以h为头的子树首次进入调整过程，此时直接打印h，就可以做到先根打印。
 */
public class MorrisPre {
	public static void morrisPre(Node head) {
		if (head == null) {
			return;
		}
		Node cur1 = head;
		Node cur2 = null;
		while (cur1 != null) {
			cur2 = cur1.left;
			if (cur2 != null) {
				while (cur2.right != null && cur2.right != cur1) {
					cur2 = cur2.right;
				}
				if (cur2.right == null) {
					cur2.right = cur1;
					System.out.print(cur1.value + " ");
					cur1 = cur1.left;
					continue;
				} else {
					cur2.right = null;
				}
			} else {
				System.out.print(cur1.value + " ");
			}
			cur1 = cur1.right;
		}
		System.out.println();
	}
}
