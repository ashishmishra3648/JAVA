package UpCasting;


class Vehicle {
	public static class Bike extends Vehicle{
		
	}
	public static class Car extends Vehicle{
		
	}
	public static class RE extends Bike{
		
	}
	public static class Duke extends Bike{
		
	}
	public static class Punch extends Car{
		
	}
	public static class Thar extends Car{
		
	}

}

class A{
	
}
class B extends A{}
class C extends Object{}
class D extends C{}

public class Demo {
	public static void m1(Object o) {
		System.out.println("m1() called");
	}
	
	public static Vehicle m2() {
		System.out.println("m2()-Vehicle");
		return new Vehicle();
	}
	
	public static void main(String[] args) {
		m1(new A());  //UPCASTING
		m1(new B()); //UPCASTING
		m1(new C()); //UPCASTING
		m1(new D()); //UPCASTING
		
		Vehicle v=m2(); //UPCASTING
		
		//Bike b=m2();
	}

}
