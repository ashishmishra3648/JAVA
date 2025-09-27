class B 
{
	public static void main(String[] args) 
	{
		m5(1);
	}
	static void m1(int i){
		System.out.println(i);
		if(i>=3) return;
		m1(i++);
		System.out.println(i);  //STACK OVERFLOW!
	} 
		
		
		static void m2(int i){
		System.out.println(i);
		if(i>=3) return;
		m2(++i);
		System.out.println(i);
		}  
		
	static void m3(int i){
		System.out.println(i);
		if(i>=3) return;
		m3(i+1);
		m3(i+1);
		System.out.println(i);
		}
		
	static void m4(int i){
		System.out.println(i);
		if(i>=3) return;
		m4(++i);
		m4(++i);
		System.out.println(i);
		}
		
	static void m5(int i){
		if(i>=3) return;
		System.out.println(i);
		m5(++i);
		m5(++i);
		System.out.println(i);
		}
		
	
		
		
		
		
	}

