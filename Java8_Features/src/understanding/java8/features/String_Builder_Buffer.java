package understanding.java8.features;

public class String_Builder_Buffer {
	
	public static void main(String[] args) {
		
		String s1 = "Vijay";
		concat1(s1);
		System.out.println("S1 = " + s1);
		
		StringBuilder builder = new StringBuilder(s1);
		concat2(builder);
		System.out.println("StringBuilder = " + builder);
		
		StringBuffer buffer = new StringBuffer(s1);
		concat3(buffer);
		System.out.println("StringBuffer = " + buffer);
	}

	private static void concat3(StringBuffer buffer) {
		buffer = buffer.append(" - Testing");
	}

	private static void concat2(StringBuilder builder) {
		builder = builder.append(" - Test");
	}

	private static void concat1(String s1) {
		s1 = s1 + "Test";
	}
}
