package understanding.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	
	public static void main(String[] args) {
		
		List<LaptopComaprable> laptopList = new ArrayList<>();
		laptopList.add(new LaptopComaprable("Dell", 500, 8));
		laptopList.add(new LaptopComaprable("HP", 750, 16));
		laptopList.add(new LaptopComaprable("Apple", 5000, 32));
		laptopList.add(new LaptopComaprable("Samsung", 150, 4));
		
		Collections.sort(laptopList);
		
		for(LaptopComaprable lap : laptopList) {
			System.out.println(lap.toString());
		}
	}
}