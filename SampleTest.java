class Sample {
	
	
	int getSampleData() {	
	  return 10;	
	}	
	String getText() {	
		return "Hello";
	}	
	static void display() {	
	  System.out.println("Hello");	
	}
	
	static int show(int x, int y) {	
	  return x + y;
	}

}


public class SampleTest {

  public static void main(String args[]) {
  
	  Sample sample = new Sample();	  
	  System.out.println(sample.getSampleData());
	  System.out.println(sample.getText());
	  
	  Sample.display();
	  System.out.println(Sample.show(10,20));
	     
  
  
  }

}