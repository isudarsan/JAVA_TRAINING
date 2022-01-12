package org.app.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {

	
	
	static int readInt(String input) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	
	static int divide(int x, int y) throws ArithmeticException {
		return x / y;
	}
	
	static void establishDatabseConnection() throws ClassNotFoundException{
		Class.forName("");
	}
	
	
	static void findFile() throws FileNotFoundException, IOException{
		File file = new File("sample.txt");
		FileInputStream in = new FileInputStream(file);
		System.out.println("File Loaded");
		
			byte[] bytes = new byte[in.available()];
			in.read(bytes);
			String st = new String(bytes);
			System.out.println(st);
	}
	
	
	
	public static void main(String[] args) {

		
//		
//		try {
//			establishDatabseConnection();
//		}catch(ClassNotFoundException ex) {
//			
//		}
		
		
		
		try {
			findFile();

		}catch(FileNotFoundException fn) {
			System.out.println("File Not Found");
			fn.printStackTrace();
			System.out.println(fn.getMessage());
		
		}catch (IOException e) {
			System.out.println("Some issue");
		}
				
		
	}

}
