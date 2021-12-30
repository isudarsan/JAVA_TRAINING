

abstract class Dummy {

  // Abstract method must reside in abstract class only	
  // When an abstract class is extended, we must override all the abstract methods in subclass, else its an error.
  public abstract void dummyMethod();	
  public abstract void printDummy();
  
  // An abstract class can contain non-abstarct methods.
  // If Subclss overides this method, implementation will be of the sub class , else implementation will be of abstract class.
  public void notDummyMethod() {
	  System.out.println("I am not Dummy !");
  }
	
}


class Something extends Dummy {
	
	public void doSomething() {
		System.out.println("Blah .. Blah !");
		
	}
	
	public void dummyMethod() {
		System.out.println("This is Dummy Method from Dummy class");
	}
	
	public void printDummy() {
		System.out.println("This printDummy method in Dummy class");
	}
	
	public void notDummyMethod() {
		System.out.println("This is overided method in Something class");
	}
}

public class AbstractClass2 {
	
	public static void main(String[] args) {
		
		
		Dummy dummy = new Something();
		
		dummy.dummyMethod(); 
		dummy.printDummy();


		dummy.notDummyMethod();
		
		Something something = new Something();
		something.doSomething();
		
		
	}
	
}