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
			if (!root.getChildren().containsKey(currentChar) && i == 0) {
				root.getChildren().put(currentChar, new TrieNode());
				prev = root;
				prevchar = currentChar;
			} else {
				if (!prev.getChildren().containsKey(currentChar)) {
					TrieNode node = new TrieNode();
					node.getChildren().put(currentChar, new TrieNode());

					prev.getChildren().put(prevchar, node);
					prev = node;
					prevchar = currentChar;
				} else {
					prevchar = currentChar;
					prev = prev.getChildren().get(currentChar);
				}

			}

		}

		prev.setEndofWord(true);

	}

	private void traverse(TrieNode node) {
		Set<Character> set = node.getChildren().keySet();
		set.forEach(key -> {
			System.out.println(key);
			if (!node.isEndofWord()) {
				traverse(node.getChildren().get(key));
			}
		});
	}

	public static void main(String args[]) {
		Trie trie = new Trie();
		trie.insert("abcd");
		trie.traverse(root);
		System.out.println("_____________________________________________________________________________");
		trie.insert("abba");
		trie.traverse(root);
		System.out.println("_____________________________________________________________________________");
		trie.insert("himanshu");
		trie.traverse(root);

	}

}
