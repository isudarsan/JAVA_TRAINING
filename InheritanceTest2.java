


class A {
	
	public void print() {
		System.out.println("This is print method belongs to class A");
	}
	
}

class B extends A {
	
	public void output() {
		System.out.println("This is output method belongs to class B");
		
		//super.print();
	}
	
	public void print() {
		System.out.println("This is print method belongs to class B");
		
		super.print();
		
		
	}
	
	//super is a keyword which is used to invoke the overidden method in sub class
	// super keyword must be used from sub class context.
}



public class InheritanceTest2 {
	
	public static void main(String args[]) {
		
		B b = new B();
		b.print();
		
		b.output();
		
		
	}
}
