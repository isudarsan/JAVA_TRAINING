

public class DataTypeTest {

	public static void main(String[] args) {
	
		int x = 10;
		int y = 20;
		
		x = x + y;
		y = x;
		y = y + 1;
		y = 20;
		x = y;
		x = x + 3;
		y = x - 2;
		
		System.out.println("X value is : "+x);
		System.out.println("Y value is : "+y);
		
	
	
	}

}