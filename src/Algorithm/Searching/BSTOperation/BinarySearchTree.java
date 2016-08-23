package Algorithm.Searching.BSTOperation;

import Algorithm.Searching.BTNode;

public class BinarySearchTree {
	public BTNode root;

	// 插入节点
	public void insert(int id) {
		BTNode newNode = new BTNode(id);
		if (root == null) {
			root = newNode;
			return;
		}
		BTNode current = root;
		BTNode parent = null;
		while (true) {
			parent = current;
			if (id < current.value) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public void display(BTNode root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.value);
			display(root.right);
		}
	}

	public boolean delete(int id) {
		BTNode parent = root;
		BTNode current = root;
		boolean isLeftChild = false;
		while (current.value != id) {
			parent = current;
			if (current.value > id) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
			if (current == null) {
				return false;
			}
		}
		// if i am here that means we have found the node
		// Case 1: if node to be deleted has no children
		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			}
			if (isLeftChild == true) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}
		// Case 2 : if node to be deleted has only one child
		else if (current.right == null) {
			if (current == root) {
				root = current.left;
			} else if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		} else if (current.left == null) {
			if (current == root) {
				root = current.right;
			} else if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} else if (current.left != null && current.right != null) {

			// now we have found the minimum element in the right sub tree
			BTNode successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.left = successor;
			} else {
				parent.right = successor;
			}
			successor.left = current.left;
		}
		return true;
	}

	public BTNode getSuccessor(BTNode deleleNode) {
		BTNode successsor = null;
		BTNode successsorParent = null;
		BTNode current = deleleNode.right;
		while (current != null) {
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		// check if successor has the right child, it cannot have left child for
		// sure
		// if it does have the right child, add it to the left of
		// successorParent.
		// successsorParent
		if (successsor != deleleNode.right) {
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}

	public boolean find(int id) {
		BTNode current = root;
		while (current != null) {
			if (current.value == id) {
				return true;
			} else if (current.value > id) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}
}
