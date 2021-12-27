


import java.util.Scanner;
public class BindingTestOne {
	
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
				
	     final int SIZE = 3;			
				
		 Item[] items = new Item[SIZE];
		 
		 
		//int[] x = new int[5];
		
		/*x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);*/
		
		
		/*for(int i = 0; i < 5; i++) {
			System.out.print("X : ");
			x[i] = scanner.nextInt();
			
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(x[i]);
		}*/
		
		

			/*for(int i = 0; i < SIZE; i++) {
				System.out.print("ID : ");
				int id = scanner.nextInt();
				System.out.print("Name : ");
				String name = scanner.next();
				System.out.print("Price : ");
				double price = scanner.nextDouble();
				
				Item item1 = new Item();
				item1.setItemNo(id);
				item1.setItemName(name);
				item1.setPrice(price);
				
				items[i] = item1;
				
			}
			
			System.out.println("Items in the array .....");*/
			
			
			/*for(int i = 0; i < 5; i++) {
				
				Item item = items[i];
				
				System.out.println(item.getItemNo() + " \t"+ item.getItemName() + "\t" + item.getPrice());
			}*/
				
				/*for(Item item : items) {
					System.out.println(item.getItemNo() + " \t"+ item.getItemName() + "\t" + item.getPrice());
					
					
				}*/
				
				

		
				/*	String[] strings = new String[3];
				
				for(int i = 0; i < 3; i++) {
					strings[i] = scanner.next();
				}
				
				for(String st : strings) {
					System.out.println(st);
				}*/
				
				double[] x = new double[3];
				
				for(int i = 0; i < x.length; i++) {
					
					x[i] = scanner.nextDouble();
				}
		
		
				for(double d : x) {
					System.out.println(d);
				}
		
		
		
		/*Item item1 = new Item();
		item1.setItemNo(111);
		item1.setItemName("AAAA");
		item1.setPrice(10.00);
		
		System.out.println("Item No : "+item1.getItemNo());
		System.out.println("Item Nane : "+item1.getItemName());
		System.out.println("Item Price : "+item1.getPrice());*/
		
	}
}