/**
 * 
 */
package org.app.main.collections;

/**
 * @author sudarsanpro
 *
 */

public class StringBuilderAndStringBuffer {

	public static void main(String args[]) {

		// Student student = new Student(111, "AAA", 32);

		// String Builder is used to append strings with others which enables mutability
		// for Strings in java, with the help of this class we can avoid creating many
		// string in memeory while doing any String operations.
		
		// String Build is asynchronus
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hello ").append("World ").append("Welcome ").append("to ").append("Java ")
				.append("Programming");

		System.out.println(builder.toString());
		

		
		// StringBuffer is synchronus
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello ").append("World ").append("Welcome ").append("to ").append("Java ")
				.append("Programming");

		System.out.println(builder.toString());

		

	}
}
