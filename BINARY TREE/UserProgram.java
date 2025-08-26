package BINARY_TREE;

public class UserProgram {

	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();

	        
	        tree.add();

	        
	        System.out.println("Tree Structure:");
	        tree.display();
	        
	        
	     
	     if (tree.contains(40)) {
	         System.out.println("Value 40 exists in the tree.");
	     } else {
	         System.out.println("Value 40 does not exist in the tree.");
	     }

	    }
	}



---------------------------------------------------------------------------------------------------------------------
  BINARY SEARCH TREE:

public class UserProgram {
   public static void main(String[] args) {
       BinarySearchTree bst = new BinarySearchTree();

       
       bst.add(50);
       bst.add(30);
       bst.add(70);
       bst.add(10);
       bst.add(40);
       bst.add(60);
       bst.add(90);

      
       System.out.println(bst.isEmpty());      
       System.out.print("PreOrder: "); bst.preOrder();
       System.out.print("InOrder: "); bst.inOrder();
       System.out.print("PostOrder: "); bst.postOrder();

     
       System.out.println("BST Size: " + bst.size());
   }



