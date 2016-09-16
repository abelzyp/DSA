package Algorithm.KMP;

/*
 * KMP算法(时间复杂度O(n))
 * 
 * 来源：
 * 		程序员代码面试指南
 * 			---IT名企算法与数据结构题目最优解
 * 步骤：
 * 		1.首先生成match字符串的nextArr数组，这个数组的长度与match字符串的长度一样，
 * 	nextArr[i]的含义是在match[i]之前的字符串match[0...i-1]中，必须以match[i-1]结尾的
 * 	后缀子串(不能包含match[0])与必须以match[0]开头的前缀子串(不能包含match[i-1])最大匹配长
 * 	度是多少。这个长度就是nextArr[i]的值。
 * 		2.假设从str[i]字符出发时，匹配到j位置的字符发现与match中的字符不一致。也就是说，str[i]
 * 	与match[0]一样，并且从这个位置开始一直可以匹配，即str[i...j-1]与match[0...j-i-1]一样，
 * 	直到发现str[j]!=match[j-i]，匹配停止。
 * 
 * 如何快速得到match字符串的nextArr数组：
 * 		1.对match[0]来说，在它之前没有字符，所以nextArr[0]规定为-1。
 * 		2.对match[1]来说，在它之前有match[0]，但nextArr数组的定义要求任何子串的后缀不能包括
 * 	第一个字符(match[0])，所以match[1]之前的字符串只有长度为0的后缀字符串，所以nextArr[0]为0。
 * 		3.之后对match[i](i>1)来说，求解nextArr[i]时，根据nextArr[0...i-1]的值求出(略)。
 */
public class KMP {
	public int getIndexOf(String s, String m) {
		if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
			return -1;
		}
		char[] ss = s.toCharArray();
		char[] ms = m.toCharArray();
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(ms);
		while (si < ss.length && mi < ms.length) {
			if (ss[si] == ms[mi]) {
				si++;
				mi++;
			} else if (next[mi] == -1) {
				si++;
			} else {
				mi = next[mi];
			}
		}
		return mi == ms.length ? si - mi : -1;
	}

	private int[] getNextArray(char[] ms) {
		if (ms.length == 1) {
			return new int[] { -1 };
		}
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < next.length) {
			if (ms[pos - 1] == ms[cn]) {
				next[pos++] = ++cn;
			} else if (cn > 0) {
				cn = next[cn];
			} else {
				next[pos++] = 0;
			}
		}
		return next;
	}
}
