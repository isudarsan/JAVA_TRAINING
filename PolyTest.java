

import javax.swing.JOptionPane;

class Calc {
	
	
	
	void add() {
		
		int x = 10;
		int y = 20;
		System.out.println("The Sum : "+(x+y));
	}
	
	void add(int x, int y) {
		System.out.println("Adding 2 numbers : "+(x+y));
	}
	
	void add(int x, int y, int z) {
		System.out.println("Adding 3 numbers : "+(x+y+z));
	}
	
	void add(String x, String y) {
		System.out.println("Adding 2 Strings : "+(x + y));
	}
	
	void add(double x, double y) {
		System.out.println("Adding doubles : "+(x + y));
	}
	
	//Method overloading doesnt depends on return type.
	/*int add() {
		return 45 + 65;
	}*/
	
	
}

public class PolyTest {
	
	public static void main(String args[]) {
		
		/*Calc calc = new Calc();
		calc.add();
		calc.add(12,13);
		calc.add(3,4,5);
		calc.add("aaa","bbb");
		calc.add(12.45, 34.45);*/
		
		//System.out.print(calc.add());
		
		
		JOptionPane.showInputDialog("Hello");
		JOptionPane.showInputDialog("Hello","This is inital value");
		JOptionPane.showInputDialog(null,"Hello Message","This is the tile",JOptionPane.ERROR_MESSAGE);
		
	}
	
	
}