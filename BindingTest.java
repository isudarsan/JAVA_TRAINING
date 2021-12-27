class Item {
	
	// public, default, protected, private
	
	// Encapsulation
	
	private int itemNo;
	private String itemName;
	private double price;	
	
	//This is a keyword which is used to distinguish the parameter of a method & filed of the class to avoid ambiguity
	void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	
	int getItemNo() {
		return itemNo;
	}
	
	void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	String getItemName() {
		return itemName;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	double getPrice() {
		return price;
	}
		
	
}

public class BindingTest {
	
	
	public static void main(String args[]) {
		
		Item item = new Item();	
		
		
		
		item.setItemNo(111);
		item.setItemName("Pen");
		item.setPrice(10.0);
		
		item.itemNo = 6666;
		
		Item item2 = new Item();
		item2.setItemNo(222);
		item2.setItemName("Ball");
		item2.setPrice(20.0);
		
		Item item3 = new Item();
		item3.setItemNo(333);
		item3.setItemName("Book");
		item3.setPrice(30.0);
		
		
		
		
		System.out.println("The Item number is : "+item.getItemNo());
		System.out.println("The Item nane is : "+item.getItemName());
		System.out.println("The Item price is : "+item.getPrice());
		
		System.out.println("The Item number is : "+item3.getItemNo());
		System.out.println("The Item nane is : "+item3.getItemName());
		System.out.println("The Item price is : "+item3.getPrice());
		
		System.out.println("The Item number is : "+item2.getItemNo());
		System.out.println("The Item nane is : "+item2.getItemName());
		System.out.println("The Item price is : "+item2.getPrice());
		
	}
	
}