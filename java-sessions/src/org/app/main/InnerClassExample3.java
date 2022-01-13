package org.app.main;


class Out {
	int x = 10;
	
	// static Inner class
	static class In {
		int y = 5;
	}
}

public class InnerClassExample3 {

	public static void main(String[] args) {

		
		// 
		
		Out.In in = new Out.In();
		System.out.println(in.y);
		
	}

}
