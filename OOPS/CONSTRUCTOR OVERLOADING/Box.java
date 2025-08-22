package OOPS;

public class Box {
	int length;
	int breadth;
	int height;
	
	Box(int n) {
		this.length=n;
		this.breadth=n;
		this.height=n;
	}
	public Box(int lenth, int breadth, int height) {
		this.length=lenth;
		this.breadth=breadth;
		this.height=height;
		
	}
	public void display() {
		System.out.println("Length : "+length);
		System.out.println("Breadth : "+breadth);
		System.out.println("Height : "+height);
		
	}
	public static void main(String[] args) {
		Box b1=new Box(10);
		b1.display();
		System.out.println("--------------------------------");
		Box b2= new Box(10,20,30);
		b2.display();
	}
	

}
