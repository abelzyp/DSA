package DataStructures.Linear;

/*
 * 对顺序表和链表进行测试的类
 */
public class Test_List {
	public static void main(String[] args) {
		// 线性表顺序测试
		SeqList sl = new SeqList();
		System.out.println(sl.Length_SeqList());
		sl.Insert_SeqList(1, "a");
		System.out.println(sl.Length_SeqList());
		sl.Insert_SeqList(2, "b");
		sl.Insert_SeqList(3, "c");
		System.out.println(sl.Length_SeqList());
		System.out.println(sl.Location_SeqList("c"));
		System.out.println("-----------------");
		LinkList ll = new LinkList();
		// System.out.println(ll.Length_LinkList());
		LinkList ll1 = ll.Create_LinkList1();
		System.out.println("建立的单链表长度为："+ll1.Length_LinkList());
		LinkNode ln = ll1.Get_LinkList(2);
		System.out.println("位置为2上的数据为："+ln.data);
		LinkNode ln2 = ll1.Locate_LinkList(5);
		System.out.println("数据5:"+ln2.data);
		ll1.Delete_LinkList(2);
		System.out.println("单链表长度为："+ll1.Length_LinkList());
		ln = ll1.Get_LinkList(2);
		System.out.println("位置为2上的数据为："+ln.data);
		
		System.out.println("--------------------");
		
	}
}
