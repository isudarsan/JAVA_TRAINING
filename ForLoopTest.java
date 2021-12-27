

public class ForLoopTest {

	public static void main(String[] args) {
	
		int number = 18;
		int count = 0;
		
		for(int i = 1; i <= number; i++) {
			
			if(number % i == 0) {
				
				System.out.println(i + " is a factor of "+number);
				
				count = count + 1;
			}
			
			
		}
		
		if(count == 2) {
			
			System.out.println(number + " is Prime");
		}else {
			System.out.println(number + " is not Prime");
		}
	
	
	}

}