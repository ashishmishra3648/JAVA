package BINARY_TREE;
	// Node.java
	public class Node {
	    Node left;
	    int key;
	    Node right;

	    Node(int key) {
	        this.key = key;
	    }

	    Node(Node left, int key, Node right) {
	        this.left = left;
	        this.key = key;
	        this.right = right;
	    }
	}


