package org.app.main;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Convertions {

	public static void main(String[] args) {

		
		
	
		
		
		int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Enter Number One"));
		int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Two"));
		
		int sum = numberOne + numberTwo;
		
		
		String value = String.valueOf(sum);
		
		JOptionPane.showMessageDialog(null, "The Sum is : "+value);
//		
		
		
//		
//		String numberOne = JOptionPane.showInputDialog("Enter number one");
//		System.out.println("The Value is : "+numberOne);
//		String numberTwo = JOptionPane.showInputDialog("Enter Number two");
//		System.out.println("The Value is : "+numberTwo);
//		
//		System.out.println(numberOne + numberTwo);
////		
		
		
		
		// Wrapper classes
	
		//int x = Integer.parseInt(numberOne);
		//int y = Integer.parseInt(numberTwo);
		
		
//		double x = Double.parseDouble(numberOne);
//		double y = Double.parseDouble(numberTwo);
//		
//		float a = Float.parseFloat(numberOne);
//		float b = Float.parseFloat(numberTwo);
//		
//		
//		short x1 = Short.parseShort(numberOne);
//		short x2 = Short.parseShort(numberTwo);
//		
//		
//		long x3 = Long.parseLong(numberOne);
//		long x4 = Long.parseLong(numberTwo);
//		
//		System.out.println(a + b);
		
		
	}

}
