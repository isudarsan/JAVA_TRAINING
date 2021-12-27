
public class MethodUsage {


	public static void main(String[] args) {
	
	
		int number = 321;
		
		reverseNumber(number);
		
		
	
		String st = "Hello";
		
		System.out.println(st.length());
		System.out.println(st.toUpperCase());
		
		String st1 = "abcdefghijk";
		
		System.out.println(st1.substring(4));
		
		
		
	
	
	}
	
	
	
	
	static void reverseNumber(int n) {
		
		
		int sum = 0;
		
		while(n > 0) {
			
			int r = n % 10;
			sum = sum * 10 + r;
			n = n /10;
			
			
		}
		
		System.out.println("The reverse number is : "+ sum);
		
	}


}


