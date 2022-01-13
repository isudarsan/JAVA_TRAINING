package org.app.main;

class Demo {

	static class DemoBuilder {

		int x;

		public DemoBuilder setX(int x) {
			this.x = x;
			return this;
		}

	}

}

class Show {

	public String hello() {
		return "abc";
	}

	public Show retunShow() {
		return this;
	}

}

public class ReturningSameClassInstance {

	public static void main(String[] args) {

		Show show = new Show();
		System.out.println(show.hello());
		Show show1 = show.retunShow();
		System.out.println(show1.hello());

	}

}
