package main.java;

import java.util.HashMap;

public class TrieNode {
	
	
	private HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	
	private boolean isEndofWord;
	private String content;
	
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}
	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}
	public boolean isEndofWord() {
		return isEndofWord;
	}
	public void setEndofWord(boolean isEndofWord) {
		this.isEndofWord = isEndofWord;
	}
	

	
	
	
}
