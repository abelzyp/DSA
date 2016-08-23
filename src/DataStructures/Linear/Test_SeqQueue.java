package DataStructures.Linear;

public class Test_SeqQueue {
	public static void main(String[] args) {
		SeqQueue sq = new SeqQueue();
		System.out.println(sq.Empty_SeqQueue()==1?"是空的":"不是空的");
		sq.In_SeqQueue("a");
		System.out.println(sq.Empty_SeqQueue()==1?"是空的":"不是空的");
		sq.In_SeqQueue("b");
		sq.Out_SeqQueue();
		System.out.println("队头元素是："+sq.Front_SeqQueue());
	}
}
