package org.app.main.streams;

public class Order implements java.io.Serializable{

	private int id;
	private String name;
	private double total;

	public Order(int id, String name, double total) {
		this.id = id;
		this.name = name;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", total=" + total + "]";
	}
	
	

}
