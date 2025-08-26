package BINARY_TREE;

public class BibarySearchTree {

	    Node root;
	    int count = 0;
	    boolean flag = true;

	    public boolean add(int key) {
	        flag = true; // reset flag every insertion
	        root = add(root, key);
	        return flag;
	    }

	    public Node add(Node n, int key) {
	        if (n == null) {
	            n = new Node(key);
	            count++;
	            return n;
	        }
	        if (key < n.key)
	            n.left = add(n.left, key);
	        else if (key > n.key)
	            n.right = add(n.right, key);
	        else
	            flag = false; // duplicate, not inserted
	        return n;
	    }

	    public int size() {
	        return count;
	    }

	    public boolean isEmpty() {
	        return count <= 0;
	    }

	    // Traversal methods
	    public void preOrder() {
	        preOrder(root);
	        System.out.println();
	    }

	    public void preOrder(Node n) {
	        if (n == null) return;
	        System.out.print(n.key + " ");
	        preOrder(n.left);
	        preOrder(n.right);
	    }

	    public void inOrder() {
	        inOrder(root);
	        System.out.println();
	    }

	    public void inOrder(Node n) {
	        if (n == null) return;
	        inOrder(n.left);
	        System.out.print(n.key + " ");
	        inOrder(n.right);
	    }

	    public void postOrder() {
	        postOrder(root);
	        System.out.println();
	    }

	    public void postOrder(Node n) {
	        if (n == null) return;
	        postOrder(n.left);
	        postOrder(n.right);
	        System.out.print(n.key + " ");
	    }
	}


