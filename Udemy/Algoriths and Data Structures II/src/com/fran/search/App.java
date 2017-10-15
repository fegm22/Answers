package com.fran.search;

public class App {

	public static void main(String[] args) {
		
		
		// O(N)   OR  O(logN)
		Tree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(15);
		bst.insert(18);
		bst.insert(6);
		bst.insert(7);
		bst.insert(3);
		bst.insert(17);
		bst.insert(2);
        bst.insert(4);
        bst.insert(20);
        bst.insert(13);

        bst.traversal();

        System.out.println(bst.checkBST(Integer.MIN_VALUE, Integer.MAX_VALUE));
		
	}

}
