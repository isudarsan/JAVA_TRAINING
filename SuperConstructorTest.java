

class Test {	
	
	private int x;
	private String y;
	
	public Test(int x) {
		this.x = x;
		System.out.println("This is X in Test: "+this.x);		
	}
	
	public Test(String y) {
		this.y = y;
		System.out.println("This is Y in Test : "+this.y);
	}
}	

class TestOne extends Test{
	
	private int y;
	
	
	public TestOne() {
		super(10);
	}
	
	public TestOne(int y) {
		// super keyword is used to invoke the super class constructor which is available in sub class.
		// only one super constructor call is possible in from a sub class constructor. 
	  
	  super("AAAA");	
	  this.y = y;
	  System.out.println("This is Y in TestOne : "+this.y);	
	}
	
}

public class SuperConstructorTest {
	
	public static void main(String args[]) {
		
		//Test test = new Test(10);	
		
		
		TestOne testOne = new TestOne(20);
		TestOne testTwo = new TestOne();
		
		
	}
}