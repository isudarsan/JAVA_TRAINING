package org.app.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(10);
		list.add("AAA");
		list.add(10.25);
		list.add('C');
		list.add(true);

		System.out.println("The Size : " + list.size());

//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// list.clear();

		// System.out.println("The Size : " + list.size());

		list.remove(1);

		System.out.println("After Removing");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
