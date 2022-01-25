package org.app.main.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileTestThree {

	public static void main(String[] args) {

		// writeData();
		readData();
	}

	static void readData() {

		File file = new File("Orders.txt");

		try {
			InputStream inputStream = new FileInputStream(file);
			DataInputStream dataInputStream = new DataInputStream(inputStream);
			
			for(int i = 0; i < 3; i++) {
				
				int id = dataInputStream.readInt();
				String orderName = dataInputStream.readUTF();
				double total = dataInputStream.readDouble();
				
				Order order = new Order(id, orderName, total);
				System.out.println(order);
			}
			
			
			dataInputStream.close();
			inputStream.close();
			
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException exception) {
			exception.printStackTrace();
		}
	}

	static void writeData() {

		File file = new File("Orders.txt");

		Scanner scanner = new Scanner(System.in);
		try {
			OutputStream outputStream = new FileOutputStream(file);
			DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

			for (int i = 0; i < 3; i++) {
				System.out.println("Order Id : ");
				int id = scanner.nextInt();
				System.out.println("Name : ");
				String orderName = scanner.next();
				System.out.println("Total : ");
				double total = scanner.nextDouble();

				Order order = new Order(id, orderName, total);

				dataOutputStream.writeInt(order.getId());
				dataOutputStream.writeUTF(order.getName());
				dataOutputStream.writeDouble(order.getTotal());
			}

			dataOutputStream.close();
			outputStream.close();

		} catch (FileNotFoundException fe) {

			fe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
