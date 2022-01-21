package org.app.main.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {
		
		
//		List<Customer> customers = new ArrayList<Customer>();
//		
//		customers.add(new Customer("Africa", "Zulu", 34));
//		customers.add(new Customer("America", "Jhon", 14));
//		customers.add(new Customer("Pakistan", "Abdul", 54));
//		
//		
//		for(Customer customer : customers) {
//			System.out.println(customer);
//		}
		

		
		
		// Bubble Sort 
		// Quick Sort, Merge Sort ... etc
		
		// Linear Search, Binaray Search
		
		
		// Bubble Sort Implementation
		int[] array = {45,-3,65,31,123};  // {-3,31,45,65,123}
		
		// Linear Search Implementation
		
//		int searchkey = 165;
//		boolean flag = false;
//		
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] == searchkey) {
//				flag = true;
//				break;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("Element Found");
//		}else {
//			System.out.println("Element Not Found");
//		}
		
//		
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = i + 1; j < array.length; j++) {
//				if(array[i] > array[j]) {
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//		
//		
//		System.out.println("Before Sort");
//		
//		
//		for(int val : array) {
//			System.out.println(val);
//		}
//		
//		// sort method is used to sort an array
//		Arrays.sort(array);
//		
//		System.out.println("\n\nAfter Sort");
//		
//		
//		for(int val : array) {
//			System.out.println(val);
//		}
		
//		
		
		
		// To use Binary Search, we need to sort the array before searching
		
		Arrays.sort(array);
		
		int x = Arrays.binarySearch(array, 65);
		
		if(x < 0) {
			System.out.println("Element Not Found" );
		}else {
			System.out.println("Element Found at location : "+x);
		}
		

	}

}
