package DataStructures.Graphical;

/*
 * 图的存储（邻接表）
 */
//顶点类
class Vertex {
	int key;// 节点的序号
	String name;// 顶点相关信息
	Edge firstEdge;// 和自己的邻接顶点之间的那条边
}

// 边类
class Edge {
	int dest;// 邻接顶点序号
	Edge link;// 顶点的下一条边
}

public class ALGraph {
	int vexNum;
	int edgeNum;
	Vertex[] nodeTable;

	// 初始化，建立一个n个节点的图
	public ALGraph(int n) {
		this.vexNum = n;
		nodeTable = new Vertex[n];
		for (int i = 0; i < nodeTable.length; i++) {
			nodeTable[i] = new Vertex();
		}
	}

	/*
	 * 下面是功能函数
	 */
	// 为这个图先构造一些节点
	public void createVex(int x, String name) {
		nodeTable[x - 1].key = x;
		nodeTable[x - 1].name = name;
	}

	// 在第x个节点和第y个节点间插入一条边
	public void insertVex(int x, int y) {
		Edge edge = new Edge();
		edge.dest = y - 1;
		edge.link = null;
		if (nodeTable[x - 1].firstEdge == null) {
			nodeTable[x - 1].firstEdge = edge;
			edgeNum++;
			System.out.println("在第" + x + "个节点和第" + y + "个节点之间插入一条边。");
		} else {
			Edge p = nodeTable[x - 1].firstEdge.link;
			while (p != null) {
				p = p.link;
			}
			p = edge;
			edgeNum++;
			System.out.println("在第" + x + "个节点和第" + y + "个节点之间插入一条边。");
		}
	}

	// 输出有关于图的一些信息
	public void info() {
		System.out.println("这个图有" + this.vexNum + "个顶点，有" + this.edgeNum
				+ "条边。");
		System.out.print("节点分别是：");
		for (int i = 0; i < nodeTable.length; i++) {
			System.out.print(nodeTable[i].name + " ");
		}
		System.out.println();
	}
	
	//图的深度优先遍历
	int[] flag = new int[vexNum];//开辟一个顶点个数大小的标志位数组
	public void DFSTraverse(int v){
		System.out.println("此处应该有图的遍历代码。");
	}
	
}
