/**
 * 
 */
package org.app.main.collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * @author sudarsanpro
 *
 */
public class HashTableExample {

	
	public static void main(String args[]) {
		
		
		
		Map<String,String> hashTable = new Hashtable<String,String>();
		hashTable.put("AAA", "A");
		hashTable.put("BBB", "B");
		hashTable.put("CCC", "C");
		hashTable.put("DDD", "D");
		
		
		// Hashtable will not allow NULL key or NULL value, where as HashMap allows NULL key and NULL values
		// Hashtable is synchronized where as HashMap is asynchronized.
		
		//hashTable.put(null, "XXXXX");
		//hashTable.put("EEE", null);
		
		
		
//		System.out.println("The Value is : "+hashTable.get("BBB"));
//		System.out.println("The Value is : "+hashTable.get("FFFFF"));
//		
		
		Collection<String> values = hashTable.values();
		
		for(String val : values) {
			System.out.println(val);
		}
		
//		Set<String> set = hashTable.keySet();
//		
//		for(String key : set) {
//			System.out.println(key);
//		}
		
		
		
		
		
	}
}
