

public class MethodTest {
	
	public static void main(String args[]) {
		
		
		printNaturalNumbers(10);
		System.out.println("Sample Application");
		printMessages();
		System.out.println("===========");
		printEvenNumbers();
		System.out.println("===========");
		printMessages();
		
		System.out.println("End of Application");
		printNaturalNumbers(20);
		
		sum(10,20);
		
		sum(5,20);
		
		printMessage("Hello techM");
		
		printNameAndAge(12,"AAAA");
		
		printNameAndAge(36,"Sudarshan");
		
		printPrank(12,45.45,"AAA");
		
		
	}
	
	static void printPrank(int x, double y, String s) {
		
		System.out.println(x + " " + y + " " + s);
	}
	
	
	static void printNameAndAge(int age, String name) {
		
		System.out.println("The Name is : "+name +" and the person age is : "+age);
	}
	
	static void printMessage(String st) {
		
		System.out.println("The message is : "+st);
	}
	
	static void sum(int x, int y) {
		
		System.out.println("The Sum is : "+(x + y));
	}
	
	
	static void printMessages() {
		
		System.out.println("Welcome");
		System.out.println("My bad");
		System.out.println("Your bad");
		System.out.println("All is well");
	}
	
	static void printNaturalNumbers(int n) {
		
		for(int i = 1; i <= n; i++) {
			System.out.print(i+"\t");
		}
		
		
		
	}
	
	
	static void printEvenNumbers() {
		
		int i = 1;
		
		while(i <= 10) {
			
			if( i % 2 == 0) {
				System.out.println(i +" is Even");
			}
			
			i = i + 1;
		}
		
		
		
	}
	
	
	
}