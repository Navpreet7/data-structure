package main.java;

import java.util.Set;

public class Trie {

	private static TrieNode root = new TrieNode();

	public void insert(String word) {

		TrieNode prev = root;
		
		char prevchar = 0;

		Character currentChar = null;
		for (int i = 0; i < word.length(); i++) {
			currentChar = word.charAt(i);

			// add root node
			if (!root.getChildren().containsKey(currentChar) && i==0) {
				root.getChildren().put(currentChar, new TrieNode());
				prev = root;
				prevchar = currentChar;
			} else {
				
					if(!prev.getChildren().containsKey(currentChar)) {
						TrieNode node = new TrieNode();				
						node.getChildren().put(currentChar, new TrieNode());
						prev.getChildren().put(prevchar,node);
						prevchar = currentChar;
						prev=node;
					}
					else {
						prevchar = currentChar;
						prev=prev.getChildren().get(currentChar);
					}
				
						
			}

		}

		prev.setEndofWord(true);

	}
	
	private void printall(char character) {
		TrieNode node =root;
		if(node.getChildren().containsKey(character)) {
			System.out.println("Please find below matches:");
			String word ="";
			while(!node.getChildren().isEmpty()) {
				
				word = word+character;
				node=node.getChildren().get(character);
//				character=node.getChildren().get
				
			}
		System.out.println(word);
		
		}else {
			System.out.println("Does not exist");
		}
		
		
		
	}

	public static void main(String args[]) {
		Trie trie = new Trie();
		trie.insert("abcd");
		trie.insert("abba");
		trie.insert("himanshu");
		trie.printall('a');
	}

}
