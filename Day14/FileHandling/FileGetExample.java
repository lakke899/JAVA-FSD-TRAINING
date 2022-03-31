package FileHandling;
import java.io.*;
public class FileGetExample {
public void main(String[] args) {
	File f1 = new File("C:FileCreateExample.txt");
	if(f1.exists()) {
		System.out.println("the file name is : "+f1.getName());
		System.out.println("Is the file writable : "+f1.canWrite());
		System.out.println("The absolute Path of the file is: "+f1.getAbsolutePath());
		System.out.println("Is the file Readable: "+f1.canRead());
		System.out.println("The size of the file in bytes: "+f1.length());
	}
	else {
		System.out.println("the file does not exist");
	}
}
}
