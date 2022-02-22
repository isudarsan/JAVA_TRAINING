package com.java.training.csv;

public class Oscar {

	private String index;
	private String year;
	private String age;
	private String movie;
	private String name;

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Oscar [index=" + index + ", year=" + year + ", age=" + age + ", movie=" + movie + ", name=" + name
				+ "]";
	}

}
