package org.app.main;


class Outer {
	int x = 10;
	
	class Inner {
		int y = 3;
	}
}


public class InnerClassesExample {

	public static void main(String[] args) {

		
		Outer outer = new Outer();
		System.out.println(outer.x);
		
		Outer.Inner inner = outer.new Inner(); // Accessing inner class from Outer class object.
		System.out.println(inner.y);
		
		
		
		
	}

}
