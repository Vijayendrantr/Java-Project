package understanding.java8.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_LinkedHashSet_TreeSet {
	
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();
		
		hashSet.add("vajay");
		hashSet.add("jaqual");
		hashSet.add("arun");
		hashSet.add("joseph");
		hashSet.add("vijay");
		
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------");
		
		linkedHashSet.add("vajay");
		linkedHashSet.add("jaqual");
		linkedHashSet.add("arun");
		linkedHashSet.add("joseph");
		linkedHashSet.add("vijay");
		
		Iterator<String> itr1 = linkedHashSet.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("---------------");
		
		treeSet.add("vajay");
		treeSet.add("jaqual");
		treeSet.add("arun");
		treeSet.add("joseph");
		treeSet.add("vijay");
		
		Iterator<String> itr2 = treeSet.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
