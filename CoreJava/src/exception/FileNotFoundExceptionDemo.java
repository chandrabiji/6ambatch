package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) {
		try {
			File f = new File("c://abc.txt");
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist");
		}
	}

}
