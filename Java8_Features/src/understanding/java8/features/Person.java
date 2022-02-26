package understanding.java8.features;

public class Person {
	
	public Person() {
		super();
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int id;
	public String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	

}
