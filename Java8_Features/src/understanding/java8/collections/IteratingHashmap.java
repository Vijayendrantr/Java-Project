package understanding.java8.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingHashmap {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Test", "test");
		map.put("Practice", "practice");
		map.put("Code", "code");
		map.put("Quiz", "quiz");
		
		for(Map.Entry<String,String> entry : map.entrySet()){
			System.out.println("Key = " + entry.getKey() + " , Value = " + entry.getValue());
		}
		
		for(String key : map.keySet()) {
			System.out.println("Key = " + key);
		}
		
		for(String value : map.values()) {
			System.out.println("Value = " + value);
		}
		
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
		}
		
		map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
	}

}
