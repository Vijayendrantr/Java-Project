package understanding.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		List<LaptopComparator> laptopList = new ArrayList<>();
		laptopList.add(new LaptopComparator("Dell", 500, 8));
		laptopList.add(new LaptopComparator("HP", 750, 16));
		laptopList.add(new LaptopComparator("Apple", 5000, 32));
		laptopList.add(new LaptopComparator("Samsung", 150, 4));
		
		Comparator<LaptopComparator> comparator = new Comparator<LaptopComparator>() {
			
			@Override
			public int compare(LaptopComparator o1, LaptopComparator o2) {
				if(o1.getLapRam() > o2.getLapRam()) {
					return 1;
				} else if (o1.getLapRam() < o2.getLapRam()) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		
		Collections.sort(laptopList, comparator);
		
		for(LaptopComparator lap : laptopList) {
			System.out.println(lap.toString());
		}
	}
}
