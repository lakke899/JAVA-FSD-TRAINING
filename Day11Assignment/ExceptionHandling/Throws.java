
package ExceptionHandling;
import java.io.*;
public class Throws {
	public static void findFile() throws IOException{
		File newFile = new File("hello");
		FileInputStream Stream = new FileInputStream(newFile) ;
	}

public static void main(String[] args) {
	try {
		findFile();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
