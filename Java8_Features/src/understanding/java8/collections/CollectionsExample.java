package understanding.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("orange");
		list.add("banana");
		list.add("apple");
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.addAll(list, "kiwi");
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(Collections.binarySearch(list, "orange"));
		
		List<String> destination_List = new ArrayList<>();
		 
        // Add elements
        destination_List.add("Shoes");
        destination_List.add("Toys");
        destination_List.add("Horse");
        destination_List.add("Tiger");
 
        // Print the elements
        System.out.println(
            "The Original Destination list is ");
 
        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");
        }
        System.out.println();
		
        // Copy the elements from source to destination
        Collections.copy(destination_List, list);
 
        // Printing the modified list
        System.out.println(
            "The Destination List After copying is ");
 
        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");
        }
	}

}
