//UPCASTING !

package UpCasting;
class A{
	int i=10;
	public void m1() {
		System.out.println("m1()-A");
	}
}
class B extends A{
	int j=20;
	public void m2() {
		System.out.println("m2()-A");
	}
}
class C extends B{
	int k=30;
	public void m3() {
		System.out.println("m3()-A");
	}
}

public class Test {
	public static void main(String[] args) {
		A a=new B();
		System.out.println(a.i);
		// System.out.println(a.j); CTE
		a.m1();
		
		B b=new C();
		System.out.println(b.i+"  "+b.j);
		// System.out.println(b.k); CTE
		b.m2();
		b.m1();
		
	}

}
