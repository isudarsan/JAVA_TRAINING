package org.app.main;

public class ThrowExampleTwo {

	static void checkAge(int age) throws AgeException{
		
		if(age < 18) {
			//System.out.println("Not Eligible for Vote");
			throw new AgeException("Invalid Age");
		}else {
			System.out.println("Eligible for Vote");
		}
	
	}

	public static void main(String[] args) {

		
		try {
			checkAge(3);
		}catch(AgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		
		
	}

}
