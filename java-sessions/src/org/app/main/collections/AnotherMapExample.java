package org.app.main.collections;

import java.util.HashMap;
import java.util.Map;

public class AnotherMapExample {

	public static void main(String[] args) {

		
		
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("A", "Animal");
		map.put("B", "Bat");
		map.put("C", "Cat");
		map.put("D", "Dog");
		map.put("E", "Elephant");
		
		
		// A map can hold a value for a NULL key
		//map.put(null, "XXXXXX");

		
		// A map will allow multiple NULL values to a key
		
		map.put("F", null);
		
		map.put("F", "Frog");
		
		map.put("F", null);
		
		//System.out.println(map.get("C"));
		//System.out.println(map.get(null));
		
		
		for(String val : map.values()) {
			System.out.println(val);
		}
		
	}

}
