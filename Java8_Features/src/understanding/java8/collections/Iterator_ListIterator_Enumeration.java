package understanding.java8.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_ListIterator_Enumeration {
	
	public static void main(String[] args) {
		
		List<String> itrList = new ArrayList<>();
		itrList.add("eat");
		itrList.add("sleep");
		itrList.add("conquer");
		
		System.out.println("Forward direction iteration using Iterator = ");
		
		//Iterator can be applied to all the collections and it can traverse only in the forward direction
		Iterator<String> itr = itrList.iterator();
		while(itr.hasNext()) {
			System.out.println(" " + itr.next());
		}
		
		System.out.println("Forward direction iteration using ListIterator = ");
		
		//ListIterator can be applied to only Arraylist and LinkedList and can traverse in both forward as well
		// reverse direction
		ListIterator<String> listItr = itrList.listIterator();
		while(listItr.hasNext()) {
			System.out.println(" " + listItr.next());
		}
		
		System.out.println("Reverse direction iteration using ListIterator = ");
		
		while(listItr.hasPrevious()) {
			System.out.println(" " + listItr.previous());
		}
		
		//Enumeration can be applied to only legacy classes like vector, hashtable, stack and dictionary
		// It can traverse only in forward direction
		System.out.println("Forward direction iteration using Enumeration = ");
		
		Hashtable<Integer, String > ht = new Hashtable<>();
		ht.put(1, "eat");
		ht.put(2, "code");
		ht.put(3, "test");
		ht.put(4, "deploy");
		
		Enumeration enumeration = ht.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}