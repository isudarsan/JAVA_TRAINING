/**
 * 
 */
package org.app.main.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author sudarsanpro
 *
 */
public class FilesExampleFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Serialization is process of storing object state in a file/network/db/socket.
		// De Serialization is process of reading the state of an object from file/network/db/socket
		//writeObject();
		
		readObject();

	}

	
	static void readObject() {
		
		try {
			InputStream inputStream = new FileInputStream(new File("OrdersDetails.dat"));
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			Object obj = objectInputStream.readObject();
			Order order = (Order) obj;
			objectInputStream.close();
			inputStream.close();
			System.out.println(order);
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
	}
	
	static void writeObject() {
		
		try {
			OutputStream outputStream = new FileOutputStream(new File("OrdersDetails.dat"));
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(new Order(111, "My Order", 450.78));
			objectOutputStream.close();
			outputStream.close();
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}
	
	
}
