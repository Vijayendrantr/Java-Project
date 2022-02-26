package understanding.java8.programming;

public class CheckIfOnlyAlphabetsInString {
	
	public static void main(String[] args) {
		
		String str = "Hello1World";
		boolean status = checkIfAlphabetsInString(str);
		if(status) {
			System.out.println("Only Alphabets ... ");
		} else {
			System.out.println("Not Alphabets Alone... ");
		}
	}

	private static boolean checkIfAlphabetsInString(String str) {
		return((str!=null) && (!str.equals("")) && str.chars().allMatch(Character::isLetter));
	}
}
