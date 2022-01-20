package org.app.main.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {

		
		
//		NavigableSet<String> set = new TreeSet<String>();
//		
//		set.add("Kumar");
//		set.add("Balu");
//		set.add("Zulu");
//		set.add("Anil");
//		set.add("Manju");
//		set.add("Kiran");
//		
//		
//		// first & last methods are from SortedSet
//		System.out.println(set.first());
//		System.out.println(set.last());
//		
//		//set.pollFirst();
//		//set.pollLast();
//		
////		Iterator<String> it = set.iterator();
////		//Iterator<String> it = set.descendingIterator();
////		
////		while(it.hasNext()) {
////			System.out.println(it.next());
////		}
		
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(123);
		set.add(32);
		set.add(45);
		set.add(0);
		set.add(6);
		set.add(254);
		
		
		
		//System.out.println(set.floor(255));
		//System.out.println(set.ceiling(100));
		
//		
		
		
		// HashSet, TreeSet, LinkedHashSet -> Set, SortedSet, NavigibleSet
		
	}

}
