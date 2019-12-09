package main.java;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		int query;
		while (n > 0) {
			query= scanner.nextInt();
			
			int size;
			if (query==1) {
				
			s1.push(scanner.nextInt());

			} else if (query==2) {

				if (s2.isEmpty()) {
					size = s1.size();
					for (int i = 0; i < size; i++) {
						s2.push(s1.pop());
					}
				}
				s2.pop();

			} else  {
				if (s2.isEmpty()) {
					size = s1.size();
					for (int i = 0; i < size; i++) {
						s2.push(s1.pop());
					}
				}			
				System.out.println(s2.peek());
			}
			
			n--;

		}

	}
}
