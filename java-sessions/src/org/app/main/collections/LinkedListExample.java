package org.app.main.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		
		// ArrayList provides basic functionality to manipulate elements
		// LinkedList provides extended functionality to manipulate elements with push,pop,poll, peek etc methods.
		
		
		// Manipulations are slow in ArrayList where as LinkedList manipulations are fast
		
		// An ArrayList is only a list, where as LinkedList can be used to replicate Stack, Queue etc.
		
		// ArrayList if fast for Sorting collections and Searching
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(123);
		list.add(345);
		list.add(34);
		list.add(76);
		list.add(0);
		list.add(145);
		list.add(-3);
		
		
		//System.out.println(list.getFirst());
		
		//System.out.println(list.getLast());
		
		
		//System.out.println(list.peek());
		
		//System.out.println(list.poll());
		
		//System.out.println(list.poll());
		
		//list.poll();
		
		//list.pop();
		
		for(int val : list) {
			System.out.println(val);
		}
//		
		
		
		
	}

}
