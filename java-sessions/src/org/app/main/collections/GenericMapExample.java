package org.app.main.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GenericMapExample {

	public static void main(String[] args) {

//		
//		Map<Integer, Item> map = new HashMap<Integer, Item>();
//		
//		
//		Item item = new Item(111, "AAA", 10.0);
//		Item item2 = new Item(222, "BBB", 32.45);
//		Item item3 = new Item(333,"CCC", 45.32);
//		
//		
//		map.put(item.getId(), item);
//		map.put(item2.getId(), item2);
//		map.put(item3.getId(), item3);
//		
//		
////		
////		Collection<Item> collection = map.values();
////		
////		
////		for(Item it : collection) {
////			System.out.println(it);
////		}
//		
//		
//		System.out.println(map.get(333));

		Item item = new Item(111, "AAA", 10.0);
		Item item2 = new Item(222, "BBB", 32.45);
		Item item3 = new Item(333, "CCC", 45.32);

		ItemService itemService = new ItemServiceImpl();

		itemService.create(item);
		itemService.create(item2);
		itemService.create(item3);

		
		/*Item itemVal = itemService.findBy(222111);
		
		if(null == itemVal) {
			System.out.println("Item not found");
		}else {
			System.out.println("Item Found with ID ; "+itemVal.getId());
			System.out.println(itemVal);
		}*/
		
		
		//itemService.update(new Item(222, "Item Updated", 1000.45));
		
		//itemService.delete(222);
		
		
		System.out.println("====================");
		
		
		Collection<Item> items = itemService.getAll();
		
		for(Item it : items) {
			System.out.println(it);
		}
		
		
		
		
		

	}

}
