

interface A {
	
	void printA();
}

interface B {
	void printB();
}

// Multiple Inheritance
class C implements A, B {
	
	public void printA() {
		System.out.println("A");
	}
	
	public void printB() {
		System.out.println("B");
	}
}


public class InterfaceTest5 {
	
	
	public static void main(String[] args ) {
			
		A a = new C();
		a.printA();
		
		B b = new C();
		b.printB(); 
		
	}
}