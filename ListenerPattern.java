

interface Subject {
	void sendMessageToObservers();
	void addObserver(Observer observer);
}

class Product implements Subject{
	
	private String productName;
	private String available;
	private int count = 0;
	private Observer[] observers = new Observer[3];
	
	public Product(String productName, String available) {
		this.productName = productName;
		this.available = available;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getAavailable() {
		return available;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setAvailable(String available) {
		this.available = available;
		sendMessageToObservers();
	}
	
	public void addObserver(Observer observer) {
		observers[count] = observer;
		++count;
	}
	
	public void sendMessageToObservers() {
		System.out.println("Sending message to all observers");
		
		for(Observer observer : observers) {
			observer.updateMessage(this.available);
		}
		
	}
}


interface Observer {
	
	void updateMessage(String message);
}

class Shop implements Observer{
	
	private String name;	
	
	public Shop(String name) {
		this.name = name;
		
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}	
	
	public void updateMessage(String message) {
		System.out.println("Hello, "+name+" the product is "+message);
	}
	
}

public class ListenerPattern {
	
	public static void main(String args[]) {		
	
	   Shop s1 = new Shop("Poorvika");
	   Shop s2 = new Shop("BigC");	
	   Shop s3 = new Shop("CellPoint");
	   
	   Product product = new Product("iPhone","Available");
	   
	   product.addObserver(s1);
	   product.addObserver(s2);
	   product.addObserver(s3);
	   
	   product.setAvailable("Un Available");   
	   
	   
		
	}
	
}