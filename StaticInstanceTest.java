



class StaticInstanceDemo {
	
	int x;
	static int Y = 20;
	
	
}

public class StaticInstanceTest {
	
	
	public static void main(String args[]) {
		
		
		
		System.out.println("Static Y : "+StaticInstanceDemo.Y);
		
		StaticInstanceDemo demo = new StaticInstanceDemo();
		
		demo.x = 10;
		System.out.println("Instance X : "+demo.x);
		
		
		StaticInstanceDemo demo2 = new StaticInstanceDemo();
		
		
		System.out.println("Instance X : "+demo.x);
		System.out.println("Instance X : "+demo2.x);
		
		
		
		
	}
}