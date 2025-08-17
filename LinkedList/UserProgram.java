package LinkedList;

public class UserProgram {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		
		linkedList.display();
		System.out.println("------------------------------------------");
		System.out.println(linkedList.size());
//		
		System.out.println(linkedList.isEmpty());
	
		System.out.println(linkedList.get(0));
		
		linkedList.add(155, 0);
		linkedList.display();
		System.out.println("------------------------------------------");
		
		linkedList.addFirst(255);
		linkedList.display();
		System.out.println("------------------------------------------");
		
		linkedList.removeFirst();
		
		linkedList.display();
		System.out.println("------------------------------------------");
		
		linkedList.remove(5);
		linkedList.display();
		System.out.println("------------------------------------------");
	}

}
