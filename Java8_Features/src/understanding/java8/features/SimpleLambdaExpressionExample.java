package understanding.java8.features;

interface Drawable {
	public void draw();
}

public class SimpleLambdaExpressionExample {
	public static void main(String[] args) {
		int width = 10;
		// with lambda
		Drawable withLambda = () -> {
			System.out.println("Drawing " + width);
		};
		withLambda.draw();
	}
}
