package Graphical;

/*
 * 图是这个样子的：
 * 	v1--2-->v2
 * 	|^
 * 	5  \
 * 	|    7
 * 	*	   \
 * 	v3--8-->v4
 */
public class Test_MGraph {
	public static void main(String[] args) {
		MGraph mg = new MGraph(4);// 建立四个节点的有向图
		mg.vexs[0] = 'A';
		mg.vexs[1] = 'B';
		mg.vexs[2] = 'C';
		mg.vexs[3] = 'D';
		mg.insertEdge(1, 2, 2);
		mg.insertEdge(1, 3, 5);
		mg.insertEdge(4, 1, 7);
		mg.insertEdge(3, 4, 8);
		mg.info();
		//System.out.println("边<1,3>权值为：" + mg.getWeight(1, 3));
		//mg.deleteEdge(4, 1);
		///mg.info();
		//System.out.println("第3个点的邻接点为第" + mg.getFirstNeighbor(3) + "个点。");
		mg.DFSTraverse(0);
	}
}
