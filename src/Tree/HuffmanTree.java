package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
 * 哈夫曼树
 */
public class HuffmanTree {
	// 定义Huffman节点类
	public static class Node<E> {
		E data;
		protected double weight;
		Node<E> lchild;
		Node<E> rchild;

		public Node(E data, double weight) {
			this.data = data;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", weight=" + weight + ", lchild="
					+ lchild + ", rchild=" + rchild + "]" + "\n";
		}
	}

	public static void main(String[] args) {
		List<Node<String>> nodes = new ArrayList<Node<String>>();
		nodes.add(new Node<String>("A", 40.0));
		nodes.add(new Node<String>("B", 8.0));
		nodes.add(new Node<String>("C", 10.0));
		nodes.add(new Node<String>("D", 30.0));
		nodes.add(new Node<String>("E", 10.0));
		nodes.add(new Node<String>("F", 2.0));
		Node<String> root = HuffmanTree.createTree(nodes);
		System.out.println(breadthFirst(root));
	}

	/**
	 * 构造Huffman树
	 * 
	 * @param nodes
	 *            节点集合
	 * @return 构造出来的Huffman树的根节点
	 */
	private static Node<String> createTree(List<Node<String>> nodes) {
		// TODO Auto-generated method stub
		while (nodes.size() > 1) {
			quickSort(nodes);
			// 获取权值最小的两个节点
			Node<String> left = nodes.get(nodes.size() - 1);
			Node<String> right = nodes.get(nodes.size() - 2);
			// 生成新节点，新节点的权值为两个子节点的权值之和
			Node<String> parent = new Node<String>(null, left.weight
					+ right.weight);
			// 让新节点作为权值最小的两个节点的父节点
			parent.lchild = left;
			parent.rchild = right;
			// 删除权值最小的两个节点
			nodes.remove(nodes.size() - 1);
			nodes.remove(nodes.size() - 1);
			// 将新生成的父节点添加到集合中
			nodes.add(parent);
		}
		return nodes.get(0);
	}

	/**
	 * 对集合中的元素进行排序
	 * 
	 * @param nodes
	 */
	private static void quickSort(List<Node<String>> nodes) {
		// TODO Auto-generated method stub
		subSort(nodes, 0, nodes.size() - 1);
	}

	/**
	 * 实现快速排序算法，对节点进行从大到小的排序
	 * 
	 * @param nodes
	 * @param i
	 * @param j
	 */
	private static void subSort(List<Node<String>> nodes, int start, int end) {
		// TODO Auto-generated method stub
		// 需要排序
		if (start < end) {
			// 以第一个元素作为分界值
			Node<String> base = nodes.get(start);
			// i从左边搜索，搜索大于分界值的元素的索引
			int i = start;
			// j从右边开始搜索，搜索小于分界值的元素的索引
			int j = end + 1;
			while (true) {
				// 找到大于分界值的元素的索引，或i已经到了end处
				while (i < end && nodes.get(++i).weight >= base.weight)
					;
				// 找到小于分界值的元素的索引，或j已经到了start处
				while (j > start && nodes.get(--j).weight <= base.weight)
					;
				if (i < j) {
					swap(nodes, i, j);
				} else {
					break;
				}
			}
			swap(nodes, start, j);
			// 递归左子序列
			subSort(nodes, start, j - 1);
			// 递归右边子序列
			subSort(nodes, j + 1, end);
		}
	}

	/**
	 * 将指定数组i和j索引处元素交换
	 * 
	 * @param nodes
	 * @param start
	 * @param j
	 */
	private static void swap(List<Node<String>> nodes, int i, int j) {
		// TODO Auto-generated method stub
		Node<String> tmp;
		tmp = nodes.get(i);
		nodes.set(i, nodes.get(j));
		nodes.set(j, tmp);
	}

	// 广度优先遍历
	public static List<Node<String>> breadthFirst(Node<String> root) {
		Queue<Node<String>> queue = new ArrayDeque<Node<String>>();
		List<Node<String>> list = new ArrayList<Node<String>>();
		if (root != null) {
			// 将根元素入“队列”
			queue.offer(root);
		}
		while (!queue.isEmpty()) {
			// 将该队列的“队尾”的元素添加到List中
			list.add(queue.peek());
			Node<String> p = queue.poll();
			// 如果左子节点不为null，将它加入“队列”
			if (p.lchild != null) {
				queue.offer(p.lchild);
			}
			// 如果右子节点不为null，将它加入“队列”
			if (p.rchild != null) {
				queue.offer(p.rchild);
			}
		}
		return list;
	}
}
