



interface DemoInterface {
	
	void display();
	
	// deafult method in interface can have body
	default void show() {
		
		System.out.println("This is show");
	}
	
}

class DemoInterfaceImpl implements DemoInterface {
	
	
	public void display() {
		System.out.println("This is display method");
	}
}


public class InterfaceTest4 {
	
	public static void main(String[] args) {
		
		DemoInterface demo = new DemoInterfaceImpl();
		demo.display();
		demo.show();
	}
}