// CONSTRUCTOR OVERLOADING!
package OOPS;

public class A {
	A(){
		System.out.println("A()-constructor");
	}
	A(int i){
		System.out.println("A(int i)-constructor");
	}
	A(int i, int j){
		System.out.println("A(int i, int j)-constructor");
	}
	public static void main(String[] args) {
		new A(30,20);
		new A(10);
		new A();
	}

}
