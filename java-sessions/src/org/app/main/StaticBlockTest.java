package org.app.main;

/**
 * Hello world!
 *
 */
public class StaticBlockTest {
	public static void main(String[] args) {

		// Before the constructor call a static block will be executed, if we want to
		// perform any logic before the object creation we need to use static block.

		// StaticBlock sample = new StaticBlock();

		try {
			// This method is used load a class at runtime dynamically
			// This is also called as reflection.

			Class.forName("com.java.training.jdbc.example.StaticBlock");

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();

		}

	}
}
