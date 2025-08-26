package BINARY_TREE;
// BinaryTree.java
import java.util.Scanner;

public class BinaryTree {
	    Node root;

	    public void add() {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the root element: ");
	        root = new Node(s.nextInt());
	        add(root, root.key);
	    }

	    public void add(Node n, int key) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Do you want to insert element at left side of " + n.key + "? (true/false): ");
	        boolean left = s.nextBoolean();
	        if (left) {
	            System.out.print("Enter value for left of " + n.key + ": ");
	            n.left = new Node(new Scanner(System.in).nextInt());
	            add(n.left, n.left.key);
	        }

	        System.out.print("Do you want to enter element at right side of " + n.key + "? (true/false): ");
	        boolean right = s.nextBoolean();
	        if (right) {
	            System.out.print("Enter value for right of " + n.key + ": ");
	            n.right = new Node(new Scanner(System.in).nextInt());
	            add(n.right, n.right.key);
	        }
	    }

	    public void display() {
	        display(root, 0);
	    }

	    public void display(Node n, int level) {
	        if (n == null) return;
	        display(n.right, level + 1);
	        if (level > 0) {
	            for (int i = 0; i < level - 1; i++)
	                System.out.print("\t");
	            System.out.print("|-----");
	        }
	        System.out.println(n.key);
	        display(n.left, level + 1);
	    }
	    
	    public boolean contains(int value) {
	        return contains(root, value);
	    }

	    private boolean contains(Node node, int value) {
	        if (node == null) {
	            return false;
	        }
	        if (node.key == value) {
	            return true;
	        }
	       
	        return contains(node.left, value) || contains(node.right, value);
	    }

	}



