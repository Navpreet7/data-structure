package main.java.solution;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Node{
	Node left;
	Node right;
	int data;
	int level;
	
	public Node(int data,Node left, Node right, int level) {
		super();
		this.left = left;
		this.right = right;
		this.data =data;
		this.level = level;
	}
	
}
public class Solution {
	
	
	

	/*
	 * Complete the swapNodes function below.
	 */
	
	static int[][] swapNodes(int[][] indexes, int[] queries) {
		/*
		 * Write your code here.
		 */
		createLeveltraversal(indexes);			
		
		return indexes;

	}
	static void createLeveltraversal(int[][] indexes) {
		ArrayList<Integer> preOrder = new ArrayList<Integer>(); 
		
		for (int i = 0; i < indexes.length; i++) {
			for(int j=0; j< 2; j++) {
				
					preOrder.add(indexes[i][j]);
				
			}		
			
		}
		System.out.println(preOrder.toString());
	}
	static Node constructTree(Node node,ArrayList<Integer> list) {
		
		
		
		return node;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		

		int n = Integer.parseInt(scanner.nextLine().trim());

		int[][] indexes = new int[n][2];

		for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
			String[] indexesRowItems = scanner.nextLine().split(" ");

			for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
				int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
				indexes[indexesRowItr][indexesColumnItr] = indexesItem;
			}
		}

		int queriesCount = Integer.parseInt(scanner.nextLine().trim());

		int[] queries = new int[queriesCount];

		for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
			int queriesItem = Integer.parseInt(scanner.nextLine().trim());
			queries[queriesItr] = queriesItem;
		}

		int[][] result = swapNodes(indexes, queries);

		/*
		 * for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
		 * for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length;
		 * resultColumnItr++) {
		 * bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));
		 * 
		 * if (resultColumnItr != result[resultRowItr].length - 1) {
		 * bufferedWriter.write(" "); } }
		 * 
		 * if (resultRowItr != result.length - 1) { bufferedWriter.write("\n"); } }
		 * 
		 * bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */
	}
}
