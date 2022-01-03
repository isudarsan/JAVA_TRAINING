


// We can not instantiate an object of Interface
interface SampleInterface {
	
	// by deafult all the methods in interface are public abstract.
	void print();
	
	int getValue();
	
	// only public fields are allowed in interface and they are static and final
	int MY_CONSTANT = 50;
	
	
}


class Demo implements SampleInterface{
	
	public void print() {
		System.out.println("This is overrided print method from Sample Interface");
	}
	
	public int getValue() {
		return 10;
	}
	
}

public class InterfaceTest {
	
	public static void main(String args[]) {
		
		
		SampleInterface sampleInterface = new Demo();
		sampleInterface.print();
		
		System.out.println(sampleInterface.getValue());
		
		System.out.println(SampleInterface.MY_CONSTANT);
		
		//SampleInterface.MY_CONSTANT = 200;// Not possible since Interface only allows static and final fields
	}
}