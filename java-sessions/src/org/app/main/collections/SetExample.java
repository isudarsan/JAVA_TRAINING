package org.app.main.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		System.out.println("List Elements");

		// List maintains the insertion order but it will not remove duplicates

//		List list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add("AAA");
//		list.add(10.25);
//		list.add('C');
//		list.add(10);
//		list.add("AAA");
//		list.add("aaa");
//
//		Iterator listIt = list.iterator();
//
//		while (listIt.hasNext()) {
//			System.out.println(listIt.next());
//		}

		//
		System.out.println("\n\n\nSet Elements");

		// Set is a data structure which can hold unique collection , it will not allow
		// duplicates.
		// Set will not retain insertion Order
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add("AAA");
		set.add(10.25);
		set.add('C');
		set.add(10);
		set.add("AAA");
		set.add("aaa");

		System.out.println("\n\n\n Tree Set");

		// TreeSet is ordering elements based on asc or desc, but it is not maintaing
		// insertion order.

		SortedSet<String> sortSet = new TreeSet<String>();

		sortSet.add("aaa");
		sortSet.add("ccc");
		sortSet.add("bbb");
		sortSet.add("ddd");
		sortSet.add("eee");
		sortSet.add("fff");

		Iterator itSort = sortSet.iterator();

		while (itSort.hasNext()) {
			System.out.println(itSort.next());
		}

		// LinkedHashSet is useful when insertion order is required.
		Set<String> inserSet = new LinkedHashSet<String>();

		inserSet.add("aaa");
		inserSet.add("aaa");
		inserSet.add("ccc");
		inserSet.add("bbb");
		inserSet.add("ddd");
		inserSet.add("aaa");
		inserSet.add("eee");
		inserSet.add("fff");

		Iterator inserIt = inserSet.iterator();

		while (inserIt.hasNext()) {
			System.out.println(inserIt.next());
		}
		
		// Summery -> 
		
		//1 . HashSet only gives default behaviour of Set
		//2. TreeSet provides ordering 
		//3. LinkedHashSet provides insertion order.
		//4. List only provide insertion order and it will not remove duplicates.

	}

}
