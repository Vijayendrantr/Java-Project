package understanding.java8.features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(41,22,34,14,12);
		// demonstration of map method
		List<Integer> square = list.stream().map(x-> x*x).collect(Collectors.toList()); 
		Iterator<Integer> iterator = square.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<String> listOfStrings = Arrays.asList("Str","Vtr","Art","Rat");
		// demonstration of filter method
		List<String> filteredList = listOfStrings.stream().filter(s->s.startsWith("V")).collect(Collectors.toList());
		Iterator<String> itr = filteredList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,2);
	    // collect method returns a set
		Set<Integer> removeDupList = numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(removeDupList);
		
		// demonstration of forEach method
		numbers.stream().map(x->x*x).forEach(z -> System.out.println(z));
		
		// demonstration of reduce method
		int even = numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		
		Map<String, String> books = new HashMap<>();
		books.put(
		"978-0201633610", "Design patterns : elements of reusable object-oriented software");
		books.put(
		  "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
		books.put("978-0134685991", "Effective Java");
		
		Optional<String> optionalIsbn  = books
				.entrySet()
				.stream()
				.filter(b->"Effective Java".equals(b.getValue()))
				.map(Map.Entry::getKey)
				.findFirst();
		
		System.out.println("optionalIsbn - " + optionalIsbn);
		
		books.put("978-0321356680", "Effective Java: Second Edition");
		
		List<String> isbnCodes = books.entrySet().stream()
				  .filter(e -> e.getValue().startsWith("Effective Java"))
				  .map(Map.Entry::getKey)
				  .collect(Collectors.toList());
		
		System.out.println("isbnCodes - " + isbnCodes);
		
		//Getting a Map‘s Values Using Streams
		List<String> titles = books.entrySet().stream()
				  .filter(e -> e.getKey().startsWith("978-0"))
				  .map(Map.Entry::getValue)
				  .collect(Collectors.toList());
		
		System.out.println("titles - " + titles);

	}
}
