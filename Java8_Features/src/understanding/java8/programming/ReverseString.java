package understanding.java8.programming;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "vijay";
		char ch;
		String reverseStr= "";
		
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			reverseStr = ch + reverseStr;
		}
		
		System.out.println("Reversed String : " + reverseStr);
	}
}
