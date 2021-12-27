

class DemoConstructor {
	
	
	
	
	
	/*fileds (ststic/instance)
		static method
			instance methods
				constructors*/
				
	
	/*void display() {
		
		System.out.println("This is Display method");
	}*/
		
		
		// The name of the constructor is of its class name
		// It will be called automatically whenever the class obejct is created
		// Constructor will not return any value.
		// Constructor can have argumenets
		// A class can have multiple construtors.
		// Java provides a default constructor for every class.
	
	DemoConstructor() {
		
	  System.out.println("This is Constructor");
	  int a = 10;
	  int b = 20;
	  System.out.println(a+b);	
	}
	
	
		
		
	
	
		
	
	
}


public class ConstructorTest {
	
	
	
	public static void main(String[] args) {
		
		DemoConstructor demoConstructor = new DemoConstructor();
		//demoConstructor.display();
		
		
		
	}
}