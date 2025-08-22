// COPY CONSTRUCTOR
package OOPS;

public class B {
	int i;
	int j;
	 B(int i, int j) {
		this.i=i;
		this.j=j;
		
	}
	B(int i) {
		this.i=i;
		this.j=i;
		
	}
	public B(B b) {
		this.i=b.i;
		this.j=b.j;
	}
	public void display() {
	    System.out.println("i = " + i + ", j = " + j);
	}

	public static void main(String[] args) {
		B b=new B(5);
//		b.display();
		B b1=new B(10,20);
//		b1.display();
		B b2=new B(b);
//		b2.display();
		System.out.println(b2);
		B b3= new B(b1);
		b3.display();

		
	}

}
