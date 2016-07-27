package Graphical;

/*
 * 图的存储（邻接矩阵类）,有向带权图
 */
public class MGraph {
	char[] vexs;// 一维数组，存图的顶点，以char类型顶点举例
	int[][] edges;// 二维数组，用来存储边的邻接矩阵
	int edgenum;// 边的数目
	private boolean[] visited;// 判断顶点是否被访问过，用于深度广度遍历

	MGraph(int n) {// 初始化一维数组和矩阵及边的数目
		vexs = new char[n];
		edges = new int[n][n];
		edgenum = 0;
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			visited[i] = false;// 把n个点都设置为未访问过
		}
	}

	/*
	 * 下面是功能函数
	 */
	// 插入节点
	// 在第x个节点和第y个节点间插入一条边
	public void insertEdge(int x, int y, int weight) {
		edges[x - 1][y - 1] = weight;
		edgenum++;
	}

	// 查询第x节点和第y节点之间的边的权值
	public int getWeight(int x, int y) {
		return edges[x - 1][y - 1];
	}

	// 删除节点
	// 删除第x个节点和第y个节点之间的那条边
	public void deleteEdge(int x, int y) {
		if (edges[x - 1][y - 1] != 0) {
			edges[x - 1][y - 1] = 0;
			edgenum--;
			System.out.println("删除边<" + x + "," + y + ">。");
		} else {
			System.out.println("根本没有边");
		}
	}

	// 得到第一个邻接结点的下标
	public int getFirstNeighbor(int x) {
		for (int j = 0; j < vexs.length; j++) {
			if (edges[x - 1][j] != 0) {
				return j + 1;
			}
		}
		return -1;
	}

	// 输出有关于图的一些信息
	public void info() {
		System.out.println("这个图有" + this.vexs.length + "个顶点，有" + this.edgenum
				+ "条边。");
		System.out.print("节点分别是：");
		for (int i = 0; i < this.vexs.length; i++) {
			System.out.print(this.vexs[i] + " ");
		}
		System.out.println();
	}

	// 图的深度优先遍历，从顶点v出发遍历
	public void DFSTraverse(int v) {
		for (int i = 0; i < vexs.length; i++) {
			if (visited[i] == false && edges[v][i] != 0) {
				this.DFS(i);
			}
		}
	}

	private void DFS(int i) {
		visited[i] = true;
		System.out.println("遍历顶点：" + i);
		for (int j = 0; j < vexs.length; j++)
			if (edges[i][j] != 0) {
				visited[j] = true;
				DFS(j);
			}
	}
}
