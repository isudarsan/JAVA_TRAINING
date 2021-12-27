


import java.util.Scanner;


public class InputTest {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		String name = scanner.nextLine();
		
		
		System.out.print("Enter Student Age : ");
		int age = scanner.nextInt();
		
		System.out.println("Enter Course Fee : ");
		double fee = scanner.nextDouble();
		
		System.out.println("Student Name : "+ name);
		System.out.println("The age is : "+ age);
		System.out.println("Student Fee : "+ fee);
	
	
	}

}