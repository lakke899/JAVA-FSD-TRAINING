package FileHandling;
import java.io.*;
public class FileCreate {
public static void main(String[] args) {
	try {
		File file1 = new File("C:FileCreateExample.txt");
		if(file1.createNewFile()) {
			System.out.println("A new file named "+file1.getName()+" has been created" );
		}
		else {
			System.out.println("File alreasy exists");
		}
	}
	catch(IOException e) {
		System.out.println("an unexpected error has occured");
		System.out.println(e);
	}
}
}
