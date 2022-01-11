package org.app.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.app.model.Employee;

public class Errors {

	public static void main(String[] args) {

		// Exception Handling

//		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter Number A : "));
//		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter Number B : "));
//		
//		
//		try {
//			int z = x / y;
//			JOptionPane.showMessageDialog(null, "The Value is : "+String.valueOf(z));
//		}catch(Exception e) {
//			JOptionPane.showMessageDialog(null, "Invalid Input entered, plz try again");
//		}

//		int x = 10;
//		int y = 0;
//		
//		System.out.println(x/y); // ArthimeticException

		// String x = "10.5";
		// int a = Integer.parseInt(x); // NumberFormatException

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Value of A : ");
//		int x = scanner.nextInt(); // InputMismatchException
//		System.out.println("The Value is : "+x);

//		Employee employee = null;
//		
//		System.out.println(employee.getId()); //Null pointer Exception

		int[] array = { 10, 20, 30, 40, 50 };

//		int a = 10;
//		int b = 0;
//		
//		try {
//			System.out.println(array[5]);
//			
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("You are trying to print an element which is not there in Array");
//		}
//
//		try {
//			System.out.print(a/b);
//		}catch(ArithmeticException e) {
//			System.out.println("Divide by zero error");
//		}

//		for(int i = 0; i <= 5; i++) {
//			
//			
//			try {
//				System.out.println(array[i] / 2);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("Error");
//			}
//			
//		}

		try {

			for (int i = 0; i <= 5; i++) {
				System.out.println(array[i] / 2);
			}
		} catch (ArithmeticException e) {
			System.out.println("Error");
		}

	}

}
