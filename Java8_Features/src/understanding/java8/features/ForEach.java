package understanding.java8.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEach {

	public static void main(String[] args) {
		forEachWithList();

		forEachWithMap();

		forEachWithSet();
	}

	public static void forEachWithList() {
		System.out.println("Method forEachWithList Start ...  \n");
		final List<Person> items = new ArrayList<>();
		items.add(new Person(100, "Ramesh"));
		items.add(new Person(100, "A"));
		items.add(new Person(100, "B"));
		items.add(new Person(100, "C"));
		items.add(new Person(100, "D"));

		for (final Person item : items) {
			System.out.println(item.getName());
		}
		System.out.println("Method forEachWithList End ...  \n");

		// lambda
		items.forEach(item -> System.out.println(item.getName()));

		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		// Output : A,B,C,D,E
		items.forEach(System.out::println);

		// Stream and filter
		// Output : B
		items.stream()
		.filter(s -> s.getName().equals("Ramesh"))
		.forEach(System.out::println);
	}

	public static void forEachWithMap() {

		// Before Java 8, how to loop map
		final Map<Integer, Person> map = new HashMap<>();
		map.put(1, new Person(100, "Ramesh"));
		map.put(2, new Person(100, "Ram"));
		map.put(3, new Person(100, "Prakash"));
		map.put(4, new Person(100, "Amir"));
		map.put(5, new Person(100, "Sharuk"));

		// In Java 8, you can loop a Map with forEach + lambda expression.
		map.forEach((k, p) -> {
			System.out.println(k);
			System.out.println(p.getName());
		});
	}

	public static void forEachWithSet() {

		final Set<String> items = new HashSet<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// before java 8
		for (final String item : items) {
			System.out.println(item);
		}

		// java 8 with lambda expression
		// Output : A,B,C,D,E
		items.forEach(item -> System.out.println(item));

		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		items.forEach(System.out::println);

		// Stream and filter
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}
}
