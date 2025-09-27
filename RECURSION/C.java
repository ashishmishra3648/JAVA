//1 to 10 without loop:
class C 
{
	public static void main(String[] args) 
	{
		// System.out.println(display(1));  CAN'T DO LIKE THIS
		display(1);
	}
	static void display(int i){
		
		if(i>10) return;
		// int a=display(i); CAN'T DO LIKE THIS
		System.out.println(i);
		
		
		display(i+1);
	}
}
