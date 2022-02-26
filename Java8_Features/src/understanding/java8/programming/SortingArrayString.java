package understanding.java8.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayString {
	
	public static void main(String[] args) {
		
		String[] countryArray = new String[] {"India", "Aus", "USA", "NZ"};
		List<String> countryList = new ArrayList<>();
		countryList = Arrays.asList(countryArray);
		
		for(String country : countryList) {
			System.out.print(" " + country);
		}
		
		System.out.println(" " );
		
		Collections.sort(countryList);
		
		for(String country : countryList) {
			System.out.print(" " + country);
		}
	}
}