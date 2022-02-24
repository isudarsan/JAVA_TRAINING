package org.app.main;

public class GarbageCollection {

	private String message;

	public GarbageCollection(String message) {
		this.message = message;
	}

	public static void main(String[] args) throws Exception {

		GarbageCollection collection = new GarbageCollection("AAAA");

		collection = null;

		System.gc();
		
		Thread.sleep(100000);
		
		
		
		// The below one is used when Threads are used
		//Runtime runtime = Runtime.getRuntime().gc();
		

	}
	
	
	// Inorder to trigger some event when we are trying to collect garbage
	// When we call System.gc the below method will be invoked.
	public void finalize() {		
		System.out.println("Garbage Collected");
		
	}

}
