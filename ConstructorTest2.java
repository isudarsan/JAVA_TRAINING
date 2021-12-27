

class DemoConstructor2 {
	
	private int x;
	private String y;
	private double z;
	
	DemoConstructor2() {
		
		System.out.println("This is default");
	}
	
	DemoConstructor2(int x) {
		this.x = x;
		System.out.println("X : "+this.x);
	}
	
	DemoConstructor2(String y) {
		this.y = y;
		System.out.println("Y : "+this.y);
	}
	
	DemoConstructor2(int x, String y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
		System.out.println("X : "+this.x + " Y : "+this.y+" Z : "+this.z); 
	}
	
	
	
}

public class ConstructorTest2 {
	
	
	
	public static void main(String[] args) {
		
		DemoConstructor2 demoConstructor2 = new DemoConstructor2();
		DemoConstructor2 demoConstructor = new DemoConstructor2("AAAA");
		DemoConstructor2 demoConstrctor1 = new DemoConstructor2(10);
		DemoConstructor2 democonstructor3 = new DemoConstructor2(10,"AAA",12.45);
		
	}
}