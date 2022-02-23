/**
 * 
 */
package org.app.main;

/**
 * @author sudarsanpro
 *
 */

class House<T> {

	T doorNumber;

	public House(T doorNumber) {
		this.doorNumber = doorNumber;
	}

	public void print() {
		System.out.println("House Number is : " + this.doorNumber);
	}

}

class CustomHouse<T, V> {

	T doorNumber;

	V streetName;

	public CustomHouse(T doorNumber, V streetName) {
		this.doorNumber = doorNumber;
		this.streetName = streetName;
	}

	public void print() {
		System.out.println("My Door NO is  : " + this.doorNumber + " and I stay at : " + this.streetName);
	}

}

class MyHouseDoorNumber {

}

public class GenericsTest {

	public static void main(String[] args) {

		// House house = new House(10);
		// House house = new House("My Door Number");
		//Generic House
		House house = new House(10.25);
		house.print();

		// Only accept doorNumber as String
		House<String> houseString = new House<String>("123-45");
		houseString.print();

		House<Integer> houseInt = new House<Integer>(123);
		houseInt.print();

		//Generic CustomHouse
		CustomHouse customHouse = new CustomHouse("123", 500);
		customHouse.print();

		
		// Only accepts Integer and String for doorNumber and Street 
		CustomHouse<Integer, String> customHouse2 = new CustomHouse<Integer, String>(111, "ABC Street");
		customHouse2.print();

	}

}
