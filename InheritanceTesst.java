




// super class
class Base {
	
	public void display() {
		System.out.println("This is display method of class - Base");
	}
	
	private void myBad() {
		System.out.println("This is My Bad belongs to Base.");
	}
	
	void myGood() {
		System.out.println("This is Good");
		
	}
	
}


// sub class

class Derived extends Base  {
	
	
	public void show() {
		System.out.println("This is show method of class - Derived");
	}
	
	
}


public class InheritanceTesst {
	
	public static void main(String args[]) {
		
		Base base = new Base();
		base.display();
		//base.myBad(); private method
		
		
		Derived derived = new Derived();
		derived.show();
		derived.display();
		//derived.myBad(); private method
		derived.myGood();
	}
	
	
}