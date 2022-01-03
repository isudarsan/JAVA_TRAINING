

import java.util.*;
import java.io.*;

interface Vehicale {
	
	void start();
}

class Byke implements Vehicale {
	
	
	public void start() {
		System.out.println("Byke Started");
	}
}


class Car implements Vehicale {
	
	public void start() {
		System.out.println("Car started");
	}
}

class Bus implements Vehicale {
	
	public void start() {
		System.out.println("Bus started");
	}
}

class Train implements Vehicale {
	
	public void start() {
		System.out.println("Train started ...");
	}
	
}

class Traveller {
		
	private Vehicale vehicle;
	
	public void setVehicle(Vehicale vehicle) {
		this.vehicle = vehicle;
	}
	
	public void journey() {
		vehicle.start();
		System.out.println("Traveller started Journey ...");
	}
	
}


public class LooseCouplingTest {
	
	
	public static void main(String args[]) throws Exception {
		
			
		Properties properties = new Properties();
		properties.load(new FileInputStream("app.properties"));
		
		String type = properties.getProperty("vehicle");	
		
		Vehicale vehicle = null;
	
		if("Car".equals(type)) {
				vehicle = new Car();
		}else if("Byke".equals(type)) {
			vehicle = new Byke();
		}else if("Bus".equals(type)) {
			vehicle = new Bus();
		}else if("Train".equals(type)) {
			vehicle = new Train();
		}
		
		
		
		Traveller traveller = new Traveller();
		traveller.setVehicle(vehicle);
		traveller.journey();	
		
	}
}