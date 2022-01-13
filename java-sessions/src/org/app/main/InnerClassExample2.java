package org.app.main;



class OuterClass {
	
	 int x = 10;
	
	// A class can have inner private class, where as delaring a class alone with private is not possible.
	private class InnerClass {
		int y = 3;
	}

	
	public int getY() {
		InnerClass innerClass = new InnerClass();
		return innerClass.y;
	}

	
	
}
public class InnerClassExample2 {

	public static void main(String[] args) {

		
		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass.x);
		
		// Inorder to access private class members we need the support of public methods from Outerclass.
		System.out.println(outerClass.getY());
		
		
	}

}
