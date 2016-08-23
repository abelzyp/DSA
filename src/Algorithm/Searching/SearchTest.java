package Algorithm.Searching;

import java.util.Arrays;

import Algorithm.Searching.BSTOperation.BinarySearchTree;

public class SearchTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("打印数组：" + Arrays.toString(arr));
		System.out.println("顺序查找元素位置在：" + SequentialSearch.Search(arr, 3));
		System.out.println("折半查找元素位置在：" + BinarySearch.Search(arr, 5));

		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		System.out.println("Delete Node with no children (2) : " + b.delete(2));
		b.display(b.root);
		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));
		b.display(b.root);
		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
		b.display(b.root);
	}
}
