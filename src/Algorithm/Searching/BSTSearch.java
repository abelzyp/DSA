package Algorithm.Searching;

/*
 * 二叉排序树查找(BinarySearchTreeSearch)
 * 		在本算法中，返回int值表示查找成功与否
 * 		返回-1表示查找不成功
 * 		返回1表示查找成功
 */
public class BSTSearch {
	public static int Search(BTNode node, int value) {
		if (node == null)
			return -1;
		if (value == node.value)
			return 1;
		else if (value > node.value) {
			return Search(node.right, value);
		} else {
			return Search(node.left, value);
		}
	}
}
