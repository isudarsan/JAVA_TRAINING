


class Music {
	
	// final keyword is also used to prevent overriding of method in sub class.
	public final void stop() {
		System.out.println("Music : Stop playing music");
	}
	
	public void play() {
		System.out.println("Music : Playing music ....");
	}
}


class Samsung extends Music {
	
	public void play() {
		System.out.println("Samsung : Playing music ...");
		//super.play();
	}
	
	public void samusngStop() {
		System.out.println("This is samsung stop");
		super.stop();
	}
	
	// Not possible since the method stop in super class is final.
	/*public void stop() {
		System.out.println("Samsung : Stop playing music ....");
	}*/
	
	
	
}

class IPhone extends Music {
	
	public void play() {
		System.out.println("IPhone : Playing music ....");
	}
}

class Sony extends Music {
	public void play() {
		System.out.println("Sony: Playing music .....");
	}
	
	
}

public class InheritanceTest3 {
	
	
	public static void main(String args[]) {
		
		Samsung samsung = new Samsung();
		samsung.play();
		samsung.samusngStop();
		
		IPhone iPhone = new IPhone();
		iPhone.play();
		
		Sony sony = new Sony();
		sony.play();
		
	}
}