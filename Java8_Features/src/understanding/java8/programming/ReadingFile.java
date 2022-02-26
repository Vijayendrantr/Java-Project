package understanding.java8.programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\2103420\\OneDrive - Cognizant\\Desktop\\readfile.txt";
		
		//Using BufferedReader
		File file = new File(filePath);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String string;
		while((string = bufferedReader.readLine())!=null) {
			System.out.println(string);
		}
		
		//Using FileReader
		FileReader fileReader = new FileReader(file);
		int i;
		while((i=fileReader.read()) !=-1) {
			System.out.println((char)i);
		}
		
		// Using Scanner Class
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}