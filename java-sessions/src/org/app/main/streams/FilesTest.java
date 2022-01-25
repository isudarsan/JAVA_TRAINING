package org.app.main.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilesTest {

	public static void main(String[] args) {

		// File
		// OutputStream
		// FileOutputStream
		// InputStream
		// FileInputStream

		// Writing content to a File
		File file = new File("sample.txt");
		
		//File file  =new File("/Users/sudarsanpro/Documents/Docs/Mockkaro_tbl_registration.sql");

//		String content = "Hello, world !, Welcome to Java Streams.";
//		try {
//			OutputStream outputStream = new FileOutputStream(file);
//			byte[] contentBytes = content.getBytes();
//			outputStream.write(contentBytes);
//			outputStream.close();
//			
//		}catch(FileNotFoundException fe) {
//			fe.printStackTrace();
//		}catch(IOException ie) {
//			ie.printStackTrace();
//		}

		
		// Reading Content from file
		try {
			InputStream inputStream = new FileInputStream(file);

			int val = 0;

			int count = 0;
			byte[] contentBytes = new byte[inputStream.available()];
			while ((val = inputStream.read()) != -1) {
				contentBytes[count] = (byte)val;
				++count;
			}
			
			inputStream.close();
			String contentString = new String(contentBytes);
			System.out.println(contentString);

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
