


interface A {
	
	void printA();
}

interface B extends A {
	void printB();
	
}

class X implements B {
	
	public void printA() {
		System.out.println("A");
	}
	
	public void printB() {
		System.out.println("B");
	}
	
}

public class InterfaceTest6 {
	
	public static void main(String[] args) {
		
		B b = new X();
		b.printA();
		b.printB();
		
	}
}


 