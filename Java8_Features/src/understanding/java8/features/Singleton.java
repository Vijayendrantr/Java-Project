package understanding.java8.features;

public class Singleton {

	// create an object of Singleton
	private static Singleton instance = new Singleton();

	// make the constructor private so that this class cannot be
	// instantiated
	private Singleton() {

	};

	// Get the only object available
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {

		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		Singleton object = Singleton.getInstance();

		// show the message
		object.showMessage();
	}

}
