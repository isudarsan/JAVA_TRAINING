import math.Calc;
import math.Printer;// To import specific class in a package

// To import all classes in a package import math.*;

import math.printers.LaserPrinter; // importing class from a sub package.




public class PackageTest {
	public static void main(String args[]) {
		
		
		int total = Calc.sum(10,20);
		System.out.println("Total : "+total);
		
		Printer printer = new Printer();
		printer.printPaper();
		
		LaserPrinter laserPrinter = new LaserPrinter();
		laserPrinter.printLaser();
		
	}
}
	
	