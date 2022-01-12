package org.app.main;

public class ExceptionTracing {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;
		
		try {
			
			System.out.println("===============");
			
			System.out.println("Hello, this the demo of stack trace & other useful methods of exception");
			int z = x /y;
			System.out.println(z);
			
		}catch(ArithmeticException e) {
			System.out.println("Invalid Input");
			
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}
