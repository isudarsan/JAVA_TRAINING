

	public class ReturnTest {
		public static void main(String[] args) {
		
		   int total = sum();
		   System.out.println("The Sum is : "+total); 
		   
		   sum();
		   
		   String printMessage = printMessage("AAAA", 12);
		   System.out.println(printMessage);
		
		}
		
		
		
		static int sum() {
		
			int x = 10;
			int y = 20;
			int z = x + y;
			
			return z;
			
			
			
		}
		
		static String printMessage(String string, int x) {
			
			if( x > 10) {
				
				String result =  string + "In if";
				return result;
			}else {
				String result1 = string + "In Else";
				return result1;
			}
			
			
			
		}
	
	
	}