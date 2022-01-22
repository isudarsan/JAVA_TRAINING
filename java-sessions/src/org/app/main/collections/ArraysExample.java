package org.app.main.collections;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {

		// Bubble Sort
		// Quick Sort, Merge Sort ... etc

		// Linear Search, Binaray Search

		// Bubble Sort Implementation
		int[] array = { 45, -3, 65, 31, 123 }; // {-3,31,45,65,123}

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

//		Arrays.sort(array);
//
//		int x = Arrays.binarySearch(array, 65);
//
//		if (x < 0) {
//			System.out.println("Element Not Found");
//		} else {
//			System.out.println("Element Found at location : " + x);
//		}

		
		Arrays.sort(array);
		
		
		
		String[] strings = { "dog", "animal", "horse", "cat", "mouse" };

		System.out.println("Before Sort\n\n");

		for (String st : strings) {
			System.out.println(st);
		}

		Arrays.sort(strings);

		System.out.println("\n\nAfter Sort\n\n");

		for (String st : strings) {
			System.out.println(st);
		}

	}

}
