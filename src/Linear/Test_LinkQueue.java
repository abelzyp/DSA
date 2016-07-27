package Linear;

public class Test_LinkQueue {
	public static void main(String[] args) {
		LinkQueue lq = new LinkQueue();
		System.out.println(lq.Empty_LinkQueue()==1?"是空的":"不是空的");
		lq.In_LinkQueue(1);
		lq.In_LinkQueue(2);
		System.out.println(lq.Empty_LinkQueue()==1?"是空的":"不是空的");
		System.out.println("队头元素是："+lq.Front_LinkQueue());
		System.out.println("出队元素是："+lq.Out_LinkQueue());
		System.out.println("队头元素是："+lq.Front_LinkQueue());
	}
}
