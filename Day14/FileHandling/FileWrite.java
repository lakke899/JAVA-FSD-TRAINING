package FileHandling;
import java.io.*;
public class FileWrite {
public static void main(String[] args) {
	try {
		FileWriter f1 = new FileWriter("C:FileCreateExample.txt");
	f1.write("I am writing to this file from the program");
	f1.close();
	System.out.println("Content has been written to the file successfully");
	}
	catch(Exception e) {
		System.out.println("Some unexpected error has occured");
		System.out.println(e);
	}
}
}
