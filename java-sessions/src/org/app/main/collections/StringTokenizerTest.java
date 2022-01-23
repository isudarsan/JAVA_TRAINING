package org.app.main.collections;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String st = "TODO Auto generated method stub";
		
		String st1 = "TODO, Auto, generated, method, stub";
		
		
		StringTokenizer tokenizer = new StringTokenizer(st1);
		
		System.out.println(tokenizer.countTokens());
		
		
		
		
		while(tokenizer.hasMoreTokens()) {
			
			String token = tokenizer.nextToken();
			System.out.println(token);
		}

	}

}
