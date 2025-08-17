package DoublyLinkedList;



public class DoubleLinkedList {
	Node headNode;
	int count=0;
	
	public void add(Object ele) {
		Node node=new Node(ele);
		if(headNode==null) {
			headNode=node;
			count++;
			return;
			
		}
		Node currNode=headNode;
		while(currNode.next!=null)
			currNode=currNode.next;
		currNode.next=node;
		node.prev=currNode;
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public void display() {
		Node currNode=headNode;
		while(currNode!=null) {
			System.out.println(currNode.ele);
			currNode=currNode.next;
		}
			
		}
	
	public void addAtIndex(Object ele,int index) {
		if(index<0||index>size()) throw new IndexOutOfBoundsException();
		
		Node node=new Node(ele);
		if(index==0) {
			addFirst(ele);
			return;
		}
		Node currNode=headNode;
		for(int i=1;i<index;i++) {
			currNode=currNode.next;
		}
		if(currNode.next!=null) {
		node.next=currNode.next;
		currNode.next.prev=node;
		}
		
		currNode.next=node;
		node.prev=currNode;
		count++;
		
		
	}
	public void addFirst(Object ele) {
		Node node=new Node(ele);
		if(headNode==null) {
			headNode=node;
		}
		else {
		node.next=headNode;
		headNode.prev=node;
		headNode=node;
		}
		
		count++;
	}
	
	 // Get element at index
    public Object getAtIndex(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        Node currNode = headNode;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        return currNode.ele;
    }

    // Remove first element
    public Object removeFirst() {
        if (isEmpty()) throw new RuntimeException("List is empty");
        Object ele = headNode.ele;
        headNode = headNode.next;
        if (headNode != null) headNode.prev = null;
        count--;
        return ele;
    }

    // Remove at index
    public Object removeAtIndex(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();

        if (index == 0) {
            return removeFirst();
        }
        Node currNode = headNode;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        Object ele = currNode.ele;
        if (currNode.next != null) {
            currNode.next.prev = currNode.prev;
        }
        if (currNode.prev != null) {
            currNode.prev.next = currNode.next;
        }
        count--;
        return ele;
    }
	
	
	
	}
	
	
		
		
	

