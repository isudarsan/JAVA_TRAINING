
import javax.swing.JFrame;
class Box {
	
	private int length;
	private int height;
	private int width;
	
	
	Box(int length, int height, int width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}
	
	Box(int side) {
		this.length = this.width = this.height = side;
	}
	
	int volume() {
		return this.length * this.height * this.width;
	}
	
}

public class Constructor3Test {
	
	
	public static void main(String args[]) {
		
		/*Box box = new Box(3,4,5);
		System.out.println("Box Volume : "+box.volume());
		
		
		Box cube = new Box(5);
		System.out.println("Cube Volume : "+cube.volume());*/
		
		//JFrame frame = new JFrame("This is my Application");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setTitle("This is my Application");
		
	}
}