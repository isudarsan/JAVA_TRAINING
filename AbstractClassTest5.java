

abstract class Shape {
	
	
	public abstract void area();
	
}

class Circle extends Shape{
	
	private double radius;
	
	
	public void area() {
		this.radius = 4.5;
	   System.out.println("Area of Circle : "+(3.141 * radius * radius));	
	} 
}

class Rectangle extends Shape {
	
	private double length;
	private double height;
	
	public void area() {
		length = 4.0;
		height = 3.0;
		System.out.println("Area of Rectangle : "+(length * height));
	}
}

class Square extends Shape {
	
	private double side;
	
	public void area() {
		side = 5.5;
		System.out.println("Area of Squre : "+(side * side));
	}
	
}


class ShapeFactory {
	
	
	public Shape createShape(String shapeName) {
		
		if("Squre".equals(shapeName)) {
			return new Square();
		}else if("Rectangle".equals(shapeName)) {
			return new Rectangle();
		}else if("Circle".equals(shapeName)) {
			return new Circle();
		}
		
		return null;
		
	}
	
}






public class AbstractClassTest5 {
	
	public static void main(String args[]) {

		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.createShape("Circle");
		shape.area();
		
		shape = factory.createShape("Squre");
		shape.area();
		
		shape = factory.createShape("Rectangle");
		shape.area();
		
		
	}
}