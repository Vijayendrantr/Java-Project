package understanding.java8.features;

interface Printable {
	void print(String msg);
}

public class LambdaExpWithSingleParameter {
	public static void main(String[] args) {

		// without lambda expression
		Printable printable = new Printable() {

			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		printable.print("message");
		
		//with lambda expression
		Printable withLambda = (msg) -> System.out.println(msg);
		withLambda.print("With lambda");
	}
}
