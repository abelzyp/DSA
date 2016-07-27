package Linear;

import java.util.Scanner;

/*
 * 实现一个int类型的线性表，链表实现
 */
public class LinkList {
	private LinkNode Head;// 定义一个头结点

	public LinkList() {
		Init_LinkList();
	}

	// 初始化
	private void Init_LinkList() {
		Head = new LinkNode(null);
	}

	// 在单链表的头部插入节点建立单链表
	public LinkList Create_LinkList1() {
		LinkList L = new LinkList();
		LinkNode s;
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字建立单链表：");
		x = sc.nextInt();
		while (x != 0) {
			s = new LinkNode(null);
			s.data = x;
			s.next = L.Head.next;
			L.Head.next = s;
			System.out.println("请继续输入数字，以0结束:");
			x = sc.nextInt();
		}
		return L;
	}

	// 在单链表的尾部插入节点建立单链表
	public LinkList Create_LinkList() {
		LinkList L = new LinkList();
		LinkNode s, r;
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请数据数据以建立单链表：");
		x = sc.nextInt();
		r = L.Head;
		while (x != 0) {// 设置标记位为0，如果遇到0就结束输入
			s = new LinkNode(null);// 申请节点
			s.data = x;// 赋值数据
			r.next = s;// 将s插入到r后面
			r = s;// 让尾标记r还指向最后
			System.out.println("L的长度为：" + L.Length_LinkList());
			System.out.println("请继续输入数据，以0结束:");
			x = sc.nextInt();
		}
		return L;
	}

	// 求表长
	public int Length_LinkList() {
		LinkNode p = Head;// 定义一个p指向头节点
		int j = 0;
		while (p.next != null) {
			p = p.next;
			j++;
		}
		return j;
	}

	// 查找位置i上的元素
	public LinkNode Get_LinkList(int i) {
		LinkNode p = Head;
		int j = 0;
		while (p.next != null && j < i) {
			p = p.next;
			j++;
		}
		if (j == i) {
			return p;
		} else {
			return null;
		}
	}

	// 查找元素x
	public LinkNode Locate_LinkList(int x) {
		LinkNode p = Head;
		while (p != null && p.data != x) {
			p = p.next;
		}
		return p;
	}

	// 插入
	public int Insert_LinkList(int i, int x) {
		LinkNode p, s;
		p = Get_LinkList(i - 1);
		if (p == null) {
			System.out.println("参数i错误");
			return 0;
		} else {
			s = new LinkNode(null);
			s.data = x;
			s.next = p.next;
			p.next = s;
			return 1;
		}
	}

	// 删除
	public int Delete_LinkList(int i) {
		LinkNode p, s;
		p = Get_LinkList(i - 1);
		if (p == null) {
			System.out.println("第i-1个节点不存在");
			return -1;
		} else if (p.next == null) {
			System.out.println("第i个节点不存在");
			return 0;
		} else {
			s = p.next;
			p.next = s.next;
			return 1;
		}
	}
}
