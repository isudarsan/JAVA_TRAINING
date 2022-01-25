package org.app.main.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTestTwo {

	public static void main(String[] args) {

		
		// Scanner class can take input from Console as well as from a file.
//		File file = new File("sample.txt");
//		
//		try {
//			Scanner scanner = new Scanner(file);			
//			//System.out.println(scanner.next());
//			System.out.println(scanner.nextLine());
//		}catch(FileNotFoundException fe) {
//			fe.printStackTrace();
//		}
		
		
		// Scanner class is also used to read primitive type data from Files.
		try {
			Scanner scanner = new Scanner(new File("Data.txt"));			
			
			while(scanner.hasNext()) {
				int id = scanner.nextInt();
				String name = scanner.next();
				double total = scanner.nextDouble();
				
				Order order = new Order(id, name, total);				
				System.out.println(order);
			}
			
			
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		
		
		
		
	}

}
