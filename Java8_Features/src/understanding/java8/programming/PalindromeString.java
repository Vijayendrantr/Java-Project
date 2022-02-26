package understanding.java8.programming;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String input = "madam";
		if (isPalindrome(input))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
		
	}
	
	static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
}
