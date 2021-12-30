

abstract class X {
	
	private int x;
	private String y;
	
	public abstract void display();
	
	public void print() {
		System.out.println("This is print from X");
	}
	
	// We can define constructors in abstract class.
	public X(int x) {
		this.x = x;
		System.out.println("X value is. : "+this.x);
	}
	
	public X(int x, String y) {
		this.x = x;
		this.y = y;
		System.out.println("X : "+this.x +" Y : "+this.y);
	}
	
}

class Y extends X {
	
	public Y() {
		super(10,"AAAAA");
	}
	
	public Y(int y) {
		super(y);
	}
	
	public void display() {
		System.out.println("Redefined abstarct method display");
	}
	
}



public class AbstractClassTest3 {
	
	
	public static void main(String[] args) {
		
		
		X x = new Y(10);
		x.print();
		x.display();
		
		x = new Y();
		
	}
}