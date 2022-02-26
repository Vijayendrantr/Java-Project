package understanding.java8.features;

interface Sayable {
	public String say();
}

public class LambdaExpWithNoParameter {
	public static void main(String[] args) {
		
		// without lambda expression
		Sayable sayable = new Sayable() {
			@Override
			public String say() {
				return "Return something ..";
			}
		};
		System.out.println("Without Lambda " + sayable.say());

		// with lambda expression
		Sayable withLambda = () -> {
			return "Return something ..";
		};
		
		System.out.println("With Lambda " + withLambda.say());
	}
}
