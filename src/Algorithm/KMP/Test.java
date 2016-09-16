package Algorithm.KMP;

public class Test {
	public static void main(String[] args) {
		String s = "aaaaaaaaaab";
		String m = "aaaab";
		KMP kmp = new KMP();
		System.out.println(kmp.getIndexOf(s, m));
	}
}
