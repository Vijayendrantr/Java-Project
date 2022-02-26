package understanding.java8.programming;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		 
		boolean isAnagram = checkAnagram("HEART","EARTH");
		if(isAnagram){
			System.out.println("String is an anagram");
		} else {
			System.out.println("String is not an anagram");
		}
	}

	private static boolean checkAnagram(String str1, String str2) {
		
		// Remove white spaces from string
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		boolean status=false;
		
		//check if strings are equal
		if(s1.length() == s2.length()){
			
			//convert the string 1 in lower case and then converts the string into a character array    
			char[] strArray1 = s1.toLowerCase().toCharArray();
			char[] strArray2 = s2.toLowerCase().toCharArray();
			
			//sorts the character array arrayS1 
			Arrays.sort(strArray1);
			Arrays.sort(strArray2);
			status = Arrays.equals(strArray1, strArray2);
			return status;
		} 
		return false;
	}
}
