算法题目：

给定两个字符串str和match，长度分别为N和M。实现一个算法，如果字符串str中含有子串match，则返回match在str中的开始位置，不含有则返回-1。


举例：

str="acbc",match="bc",则返回2.

str="acbc",match="bcc",则返回-1.
	

要求：

如果match的长度大于str的长度(M>N)，str必然不会含有match，可直接返回-1.但如果N>=M，要求算法的复杂度为O(N)。
	
本题就是著名的KMP算法，该算法是由Donald Kunth、Vaughan Pratt和James H.Morris于1977年联合发明的。