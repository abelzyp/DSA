弗洛伊德算法介绍

和Dijkstra算法一样，弗洛伊德(Floyd)算法也是一种用于寻找给定的加权图中顶点间最短路径的算法。
该算法名称以创始人之一、1978年图灵奖获得者、斯坦福大学计算机科学系教授罗伯特·弗洛伊德命名。


基本思想

通过Floyd计算图G=(V,E)中各个顶点的最短路径时，需要引入一个矩阵S，矩阵S中的元素a[i][j]表示顶点i(第i个顶点)到顶点j(第j个顶点)的距离。
假设图G中顶点个数为N，则需要对矩阵S进行N次更新。初始时，矩阵S中顶点a[i][j]的距离为顶点i到顶点j的权值；如果i和j不相邻，则a[i][j]=∞。
接下来开始，对矩阵S进行N次更新。第1次更新时，如果"a[i][j]的距离" > "a[i][0]+a[0][j]"(a[i][0]+a[0][j]表示"i与j之间经过第
1个顶点的距离")，则更新a[i][j]为"a[i][0]+a[0][j]"。 同理，第k次更新时，如果"a[i][j]的距离" > "a[i][k]+a[k][j]"，则更新
a[i][j]为"a[i][k]+a[k][j]"。更新N次之后，操作完成！