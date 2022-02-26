package understanding.java8.programming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		X a = new X(20, "Testing");

		// Serializing 'a'
		FileOutputStream fos = new FileOutputStream("C:\\Users\\2103420\\OneDrive - Cognizant\\Desktop\\readfile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);

		// De-serializing 'a'
		FileInputStream fis = new FileInputStream("C:\\Users\\2103420\\OneDrive - Cognizant\\Desktop\\readfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		X b = (X) ois.readObject();// down-casting object

		System.out.println(b.i + " " + b.s);

		// closing streams
		oos.close();
		ois.close();
	}
}

class X implements Serializable {
	int i;
	String s;

	// A class constructor
	public X(int i, String s) {
		this.i = i;
		this.s = s;
	}
}
