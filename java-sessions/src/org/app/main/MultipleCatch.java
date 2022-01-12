package org.app.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		
		//Multiple Catch blocks
		
//		try {
//			int number = scanner.nextInt();
//			
//			if( 99 % number == 0) {
//				System.out.println(number + " is a factor of 99");
//			}
//		}catch (InputMismatchException e) {
//			System.out.println("Valid Number must be entered.");
//		}catch(ArithmeticException e1) {
//			System.out.println("Zero is inavlid Input");
//		}
		
		
		// Handling multiple exceptions for single logic
		
//		try {
//			int number = scanner.nextInt();
//			
//			if( 99 % number == 0) {
//				System.out.println(number + " is a factor of 99");
//			}
//		}catch (InputMismatchException | ArithmeticException e) {
//			System.out.println("Invalid Input");
//		}finally {
//			System.out.println("Finally executed");
//		}
		
				
//		try {
//			int number = scanner.nextInt();
//			
//			if( 99 % number == 0) {
//				System.out.println(number + " is a factor of 99");
//			}
//		}catch (InputMismatchException e) {
//			System.out.println("Valid Number must be entered.");
//		}catch(ArithmeticException e1) {
//			System.out.println("Zero is inavlid Input");
//		}catch(Exception ex) {
//			System.out.println("Something else");
//		}
		
		
		
		// The below piece of code doesnt work, since the super class exception is already handled in the begining.
		
//		try {
//			int number = scanner.nextInt();
//			
//			if( 99 % number == 0) {
//				System.out.println(number + " is a factor of 99");
//			}
//		}catch (Exception e) {
//			System.out.println("Something else");
//		}catch(ArithmeticException e1) {
//			System.out.println("Zero is inavlid Input");
//		}catch(InputMismatchException ex) {
//			System.out.println("SValid Number must be entered.");
//		}
		
	}

}
