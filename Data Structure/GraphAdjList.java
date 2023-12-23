//import java.util.LinkedList;
//
//public class GraphAdjList {
//	int V;
//	int E;
//	LinkedList<Integer>[] adj;
//	public GraphAdjList(int nodes) {
//		this.V=nodes;
//		this.E=0;
//		this.adj=new LinkedList[nodes];
//		for(int i=0;i<nodes;i++) {
//			this.adj[i]=new LinkedList<>();
//		}
//	}
//	public void addEdge(int u,int v) {
//		this.adj[u].add(v);
//		this.adj[v].add(u);
//		E++;
//	}
//	public String toString() {
//		StringBuilder sb=new StringBuilder();
//		sb.append(V+" vertices "+E+" edges \n");
//		
//	}
//	
//public static void main(String[] args) {
//	GraphAdjList adj=new GraphAdjList(4);
//	adj.addEdge(0, 1);
//	adj.addEdge(1, 2);
//	adj.addEdge(2, 3);
//	adj.addEdge(3, 0);
//}
//}
