package com.balazsholczer.bst;

public class App {

	public static void main(String[] args) {
		
		
		// O(N)   OR  O(logN)
		Tree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(1);
		bst.insert(2);
		bst.insert(2);
		bst.insert(3);
		bst.insert(3);
		bst.insert(4);
		bst.insert(4);
		
		bst.traversal();
		
	}

}
