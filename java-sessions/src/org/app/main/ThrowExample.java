package org.app.main;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int number = scanner.nextInt();
		
		try {
			if(number % 2 == 0) {
				System.out.println("Even");
			}else {
				throw new Exception("This is odd number");
			}
		}catch(Exception e) {
			System.out.println("Handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	}

}
