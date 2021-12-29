



abstract class Shape {
	
	// abstract method
	public abstract double area(); 
	
}

class Rectangle extends Shape {
	
	private int length;
	private int height;
	
	
	public Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
	}
	
	public double area() {		
		return length * height;
	}
	
	
}

class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	public double area() {
		return 3.141 * radius * radius;
	}
}

class Box extends Shape{
	
	private int length;
	private int width;
	private int height;
	
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return length * height * width;
	}
	
}



public class AbstractClassTest {
	
	
	public static void main(String args[]) {
		
		//Shape shape = new Shape();
		
		Shape shape = new Rectangle(4,5);
		
		System.out.println("Area of Rectangle : "+shape.area());
		
		
		shape = new Circle(4);
		System.out.println("Area of Circle : "+shape.area());
		
		shape = new Box(1, 2, 3);
		System.out.println("Area of Box : "+shape.area());
		
	}
	
}