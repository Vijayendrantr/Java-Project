package understanding.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambdaExp {

    public static void main(String[] args) {

        List<Persun> listOfPerson = new ArrayList<Persun>();
        listOfPerson.add(new Persun("abc", 27));
        listOfPerson.add(new Persun("mno", 26));
        listOfPerson.add(new Persun("pqr", 28));
        listOfPerson.add(new Persun("xyz", 27));

        // Without lambda expression.
        // Sort list by age
        Comparator<Persun> comparator = new Comparator<Persun>() {
            @Override
            public int compare(Persun o1, Persun o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(listOfPerson, comparator);

        System.out.println(" sort persons by age in ascending order");
        for (Persun Persun : listOfPerson) {
            System.out.println(" Person name : " + Persun.getName());
        }

        // Witht lambda expression.
        // Sort list by age

        Collections.sort(listOfPerson, (Persun o1, Persun o2) -> {
            return o1.getAge() - o2.getAge();
        });
        
        // Use forEach method added in java 8
        System.out.println(" sort persons by age in ascending order");
        listOfPerson.forEach(
           (person) -> System.out.println(" Person name : " + person.getName()));
        }
  }

class Persun {
    private String name;
    private int age;

    public Persun(String name, int age) {
       super();
       this.name = name;
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}