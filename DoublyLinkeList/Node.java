package DoublyLinkedList;

public class Node {
	Node next;
	Object ele;
	Node prev;
	
	Node(Object ele){
	this.ele=ele;
	}
	public Node(Node next,Object ele,Node prev) {
		this.next=next;
		this.ele=ele;
		this.prev=prev;
	}
		
	}
	
	
	


