package DataStructures.Linear;

/*
 * 对顺序栈和链栈进行测试的类
 */
public class Test_Stack {
	public static void main(String[] args) {
		SeqStack ss = new SeqStack();
		System.out.println("栈的长度为：" + ss.Length_SeqStack());
		ss.Push_SeqStack("a");
		ss.Push_SeqStack("b");
		ss.Push_SeqStack("c");
		System.out.println("栈的长度为：" + ss.Length_SeqStack());
		System.out.println("栈顶元素为：" + ss.Top_SeqStack());
		System.out.println("出栈元素为：" + ss.Pop_SeqStack());
		System.out.println("栈的长度为：" + ss.Length_SeqStack());
		System.out.println("-------------");
		LinkStack ls = new LinkStack();
		System.out.println("栈的长度为：" + ls.Length_LinkStack());
		ls.Push_LinkStack(1);
		ls.Push_LinkStack(5);
		ls.Push_LinkStack(9);
		System.out.println("栈的长度为：" + ls.Length_LinkStack());
		System.out.println("出栈的元素为：" + ls.Pop_LinkStack());
		System.out.println("栈的长度为：" + ls.Length_LinkStack());
		
	}
}
