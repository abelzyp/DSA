package Linear;

/*
 * 线性结构 字符串
 */
public class SeqString {
	private static final int MAXSIZE = 256;
	private int curlen;// 字符串中最后一个元素位置
	private char[] data;

	public SeqString() {
		Init_SeqString(MAXSIZE);
	}

	private void Init_SeqString(int size) {
		data = new char[size];
		curlen = -1;
	}

	// 求串长
	public int Length_SeqString() {
		return curlen + 1;
	}

	// 串连接
	public int Concat_SeqString(SeqString s1, SeqString s2, SeqString s) {
		int i, j, len1, len2;
		len1 = s1.Length_SeqString();
		len2 = s2.Length_SeqString();
		if (len1 + len2 > MAXSIZE - 1)
			return -1;
		i = 0;
		while (i < len1) {
			s.data[i] = s1.data[i];
			i++;
		}
		j = 0;
		while (j < len2) {
			s.data[i] = s2.data[j];
			i++;
			j++;
		}
		s.curlen = len1 + len2 - 1;
		return s.curlen;
	}

	// 求子串,用t返回s中第i个字符开始长度为len的子串
	public int Sub_SeqString(SeqString t, SeqString s, int i, int len) {
		int slen;
		slen = s.Length_SeqString();
		if (i < 1 || i > slen || len < 0 || len > slen - i + 1) {
			System.out.println("参数错误");
			return -1;
		}
		for (int j = 0; j < len; j++) {
			t.data[j] = s.data[i + j - 1];
		}
		t.curlen = len;
		return 1;
	}

	// 串比较
	public int Comp_SeqString(SeqString s1, SeqString s2) {
		int i = 0;
		while (s1.data[i] == s2.data[i] && i < s1.curlen) {
			i++;
		}
		return (s1.data[i] - s2.data[i]);
	}

	// 串匹配，从串s的第一个字符开始找第一个与串t相等的子串，返回第一次找到的索引
	public int StrIndex_BF(SeqString s, SeqString t) {
		int i = 1, j = 1;
		while (i < s.curlen && j < t.curlen) {
			if (s.data[i] == t.data[j]) {
				i++;
				j++;
			} else {
				i = i - j + 2;
				j = 1;
			}
		}
		if (j > t.curlen)
			return (i - t.curlen);
		else
			return 0;
	}
}
