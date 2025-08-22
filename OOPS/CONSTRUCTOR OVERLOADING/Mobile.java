package OOPS;

public class Mobile {
	String name;
	int ram;
	int rom;
	String color;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	Mobile(String name){
		this.name=name;
		
	}
	Mobile(String name,int ram){
		this.name=name;
		this.ram=ram;
		
	}
	Mobile(String name,int ram,int rom,String color){
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.color=color;
	}
	public void display() {
		System.out.println("Mobile Name : "+name);
		System.out.println("Mobile ram : "+ram);
		System.out.println("Mobile rom : "+rom);
		System.out.println("Mobile Color : "+color);
		
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.display();
		System.out.println("--------------------------------");
		Mobile m2=new Mobile("Iphonne",16);
		m2.display();
	}

}
