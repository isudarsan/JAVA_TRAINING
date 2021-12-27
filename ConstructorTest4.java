

class Demo {
	
	private int x;
	
	
	// this() can call any other constructors of its own class.
	public Demo() {		
		this(10);		
	}
	
	public Demo(int x) {
		this(10,"AAAA");
		this.x = x;
		System.out.println("X : "+this.x);
	}
	
	
	public Demo(int x, String message) {
		this.x = x;
		System.out.println(this.x + " " + message);
	}
	
}


public class ConstructorTest4 {
	
	
	public static void main(String args[]) {
		
		Demo demo = new Demo();
		
		
	}
}