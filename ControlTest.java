


public class ControlTest {

	public static void main(String args[]) {
	
		int n = 9;
		int i = 1;
		int count = 0;
		
		while ( i <= n) {
			
			if( n % i == 0) {
				
				System.out.println(i + " is a factor of "+ n);
				count = count + 1;
			}
			
			i = i + 1;
		}
		
		System.out.println();
		
		if( count == 2) {
			System.out.println(n + " is Prime");
		}else {
			System.out.println(n + " is Not Prime");
		}
		
	
	}


}