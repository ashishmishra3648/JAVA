package LinkedList;

public class Node{
	Object eleObject;
	Node nextNode;
	
	Node(Object eleObject){
		this.eleObject=eleObject;
	}
	
	public Node(Object eleObject,Node nextNode) {
		this.eleObject=eleObject;
		this.nextNode=nextNode;
	}
}
