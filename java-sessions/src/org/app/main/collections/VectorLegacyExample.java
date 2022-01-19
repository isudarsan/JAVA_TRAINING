package org.app.main.collections;

import java.util.List;
import java.util.Vector;

public class VectorLegacyExample {

	public static void main(String[] args) {

		//List list = new ArrayList();
		
		
		// Vector is synchronized where as ArraList is asyncronized collection
		List list = new Vector();
		list.add(10);
		list.add("AAA");
		list.add(10.25);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
