package org.app.main.collections;



class ColorTest {

	Colors color;
	
	public ColorTest(Colors color) {
		this.color = color;
	}

	public void whichColor() {

		switch (color) {

		case RED:
			System.out.println("The Color is Red");
			break;
		case GREEN:
			System.out.println("The Color is Green");
			break;
		case YELLOW:
			System.out.println("The Color is Yellow");
			break;

		}

	}

}

public class EnumTest {

	public static void main(String[] args) {

		
		// Enum is a type which is used to represent group of constants belongs to similar category
		
//		Colors color = Colors.RED;
//
//		System.out.println(color);
//
//		Colors color1 = Colors.YELLOW;
//		System.out.println(color1);

//		String colorName = "RED";
//		
//		
//		ColorTest colorTest = new ColorTest(Colors.valueOf(colorName));
//		colorTest.whichColor();
		
		
		Colors[] colors = Colors.values();
		
		for(Colors c : colors) {
			System.out.println(c.name() + " " + c.ordinal());
		}

	}
}
