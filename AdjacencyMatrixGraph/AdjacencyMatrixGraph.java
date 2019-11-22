package main.java.graphs;

public class AdjacencyMatrixGraph {
	
	
	private boolean matrix[][];
	public AdjacencyMatrixGraph(int nodesCount) {
		matrix=new boolean[nodesCount][nodesCount];
		
	}
	public void addEdge(int i , int j) {
		matrix[i][j]=true;
		matrix[j][i]=true;
	}
	public void removeEdge(int i , int j) {
		matrix[i][j]=false;
		matrix[j][i]=false;
	}
	

	public static void main(String[] args) {
		AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 0);
		
	}

}
