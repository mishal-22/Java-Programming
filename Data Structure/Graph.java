import java.util.Arrays;

public class Graph {
int[][] adjMatrix;
int v;
int e;
public Graph(int nodes) {
	this.v=nodes;
	this.e=0;
	this.adjMatrix=new int[nodes][nodes];
}
public void addEdges(int u,int v) {
	this.adjMatrix[u][v]=1;
	this.adjMatrix[v][u]=1;
	e++;
}


public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(v+" vertices "+e+" edges \n");
	for(int i=0;i<v;i++) {
		sb.append(i+": ");
		for(int j:adjMatrix[i]) {
			sb.append(j+" ");
		}
		sb.append("\n");
	}
	return sb.toString();
}
public static void main(String[] args) {
	Graph graph=new Graph(4);
	graph.addEdges(0, 1);
	graph.addEdges(1,2);
	graph.addEdges(2, 3);
	graph.addEdges(3, 0);
	System.out.println(graph);
}
}
