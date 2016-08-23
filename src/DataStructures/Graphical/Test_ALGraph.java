package DataStructures.Graphical;

/*
 * 图是这个样子的：
 * 	v1----->v2
 * 	|\
 * 	|  \
 * 	|    \
 * 	*	   *
 * 	v3----->v4
 */
public class Test_ALGraph {
	public static void main(String[] args) {
		ALGraph alg = new ALGraph(4);
		alg.createVex(1, "v1");
		alg.createVex(2, "v2");
		alg.createVex(3, "v3");
		alg.createVex(4, "v4");

		alg.insertVex(1, 2);
		alg.insertVex(1, 3);
		alg.insertVex(1, 4);
		alg.insertVex(3, 4);
		alg.info();
	}
}
