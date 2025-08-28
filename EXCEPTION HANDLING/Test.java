package EXCEPTION_HANDLING;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main Starts");
//		System.out.println(10/0);
		try {
			System.out.println(10/0);
		} catch(ArithmeticException a) {
			System.out.println("Exception Handled");
		}
		System.out.println("Main Starts");
	}

}
